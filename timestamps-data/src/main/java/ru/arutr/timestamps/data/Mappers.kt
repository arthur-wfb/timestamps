package ru.arutr.timestamps.data

import ru.arutr.timestamps.data.model.TimeStamp
import ru.arutr.timestampsdatabase.models.TimeStampDBO

fun TimeStampDBO.toTimeStamp() = TimeStamp(this.id, this.title, this.description, this.date)