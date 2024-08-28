package ru.arutr.timestampsdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.arutr.timestampsdatabase.dao.TimeStampDao
import ru.arutr.timestampsdatabase.models.TimeStampDBO
import ru.arutr.timestampsdatabase.utils.TypeConverter

class TimeStampsDatabase internal constructor(timeStampsRoomDatabase: TimeStampsRoomDatabase) {
    val timeStampsDao = timeStampsRoomDatabase.timeStampsDao()
}

@Database(entities = [TimeStampDBO::class], version = 1)
@TypeConverters(TypeConverter::class)
internal abstract class TimeStampsRoomDatabase : RoomDatabase() {
    abstract fun timeStampsDao(): TimeStampDao

}

fun TimeStampsDatabase(applicationContext: Context): TimeStampsDatabase {
    val timeStampsRoomDatabase = Room.databaseBuilder(
        context = applicationContext.applicationContext,
        klass = TimeStampsRoomDatabase::class.java,
        name = "timestamps-database"
    ).build()
    return TimeStampsDatabase(timeStampsRoomDatabase)
}

