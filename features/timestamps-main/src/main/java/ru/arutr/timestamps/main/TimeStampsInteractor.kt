package ru.arutr.timestamps.main

import kotlinx.coroutines.flow.Flow
import ru.arutr.timestamps.data.TimeStampsRepository
import ru.arutr.timestamps.data.model.TimeStamp

internal class TimeStampsInteractor(private val repository: TimeStampsRepository) {
    suspend fun getUpcoming(): Flow<List<TimeStamp>> {
        return repository.getUpcoming()
    }

    suspend fun getPast(): Flow<List<TimeStamp>> {
        return repository.getPast()
    }

    suspend fun insert(timeStamp: TimeStamp) {
        repository.insert(timeStamp)
    }

    suspend fun remove(timeStamp: TimeStamp) {
        repository.remove(timeStamp)
    }

}