package ru.arutr.timestamps.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.arutr.timestamps.data.model.TimeStamp
import ru.arutr.timestampsdatabase.TimeStampsDatabase


class TimeStampsRepository(private val database: TimeStampsDatabase) {

    suspend fun getUpcoming(): Flow<List<TimeStamp>> {
        return database.timeStampsDao
            .getUpcoming()
            .map { timestamps -> timestamps.map { it.toTimeStamp() } }
    }

    suspend fun getPast(): Flow<List<TimeStamp>> {
        return TODO("Provide the return value")
    }

    suspend fun insert(timeStamp: TimeStamp) {
        // TODO
    }

    suspend fun remove(timeStamp: TimeStamp) {
        // TODO
    }
}