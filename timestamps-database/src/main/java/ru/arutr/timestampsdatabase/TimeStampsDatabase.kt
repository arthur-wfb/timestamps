package ru.arutr.timestampsdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.arutr.timestampsdatabase.dao.TimeStampDao
import ru.arutr.timestampsdatabase.models.TimeStampDBO
import ru.arutr.timestampsdatabase.utils.TypeConverter

@Database(entities = [TimeStampDBO::class], version = 1)
@TypeConverters(TypeConverter::class)
abstract class TimeStampsDatabase : RoomDatabase() {
    abstract fun timeStampsDao(): TimeStampDao

}

fun TimeStampsDatabase(applicationContext: Context): TimeStampsDatabase =
    Room.databaseBuilder(
        context = applicationContext.applicationContext,
        klass = TimeStampsDatabase::class.java,
        name = "timestamps-database"
    ).build()
