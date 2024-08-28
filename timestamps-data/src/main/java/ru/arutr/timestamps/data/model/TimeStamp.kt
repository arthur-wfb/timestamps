package ru.arutr.timestamps.data.model

import java.util.Date

data class TimeStamp(
    val id: Long,
    val title: String,
    val description: String,
    val date: Date,
)
