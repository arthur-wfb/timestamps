package ru.arutr.timestamps.main.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TimeStampCard(timeStamp: TimeStampUi) {
    Column {
        Text(timeStamp.title)
        Text(timeStamp.description)
        Text(timeStamp.date)
        Text(timeStamp.timeDifference)
    }
}

@Composable
@Preview
fun Preview() {

    TimeStampCard(TimeStampUi(
        title = "День рождения",
        description = "С друзьями",
        date = "15.06.2025",
        timeDifference = "Через 6 мес и 3 дня",
    ))
}