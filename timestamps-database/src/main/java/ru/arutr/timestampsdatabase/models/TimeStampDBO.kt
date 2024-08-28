package ru.arutr.timestampsdatabase.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "timestamps")
data class TimeStampDBO(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo("title") val title: String,
    @ColumnInfo("description") val description: String,
    @ColumnInfo("date") val date: Date,
//    @ColumnInfo("tags") val tags:
)