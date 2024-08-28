package ru.arutr.timestampsdatabase.utils

import java.util.Date
import androidx.room.TypeConverter
import java.text.DateFormat

internal class TypeConverter {

    @TypeConverter
    fun fromTimestamp(value: String?): Date? {
        return value?.let { DateFormat.getDateTimeInstance().parse(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): String? {
        return date?.let { DateFormat.getDateTimeInstance().format(it) }
    }
}