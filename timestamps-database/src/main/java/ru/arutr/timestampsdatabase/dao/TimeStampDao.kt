package ru.arutr.timestampsdatabase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.arutr.timestampsdatabase.models.TimeStampDBO

@Dao
interface TimeStampDao {

    @Query("SELECT * FROM timestamps WHERE date > unixepoch()")
    fun getUpcoming(): Flow<List<TimeStampDBO>>

    @Query("SELECT * FROM timestamps WHERE date < unixepoch()")
    fun getPast(): Flow<List<TimeStampDBO>>

    @Insert
    fun insert(timeStamp: TimeStampDBO)

    @Delete
    fun remove(timeStamp: TimeStampDBO)
}