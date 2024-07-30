package ru.arutr.timestampsdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.arutr.timestampsdatabase.dao.TimeStampDao
import ru.arutr.timestampsdatabase.models.TimeStampDBO

@Database(entities = [TimeStampDBO::class], version = 1)
abstract class TimeStampsDatabase : RoomDatabase() {
    abstract fun timeStampsDao(): TimeStampDao

}

fun TimeStampsDatabase(applicationContext: Context): TimeStampsDatabase =
    Room.databaseBuilder(
        context = applicationContext.applicationContext,
        klass = TimeStampsDatabase::class.java,
        name = "timestamps-database"
    ).build()
