package ru.arutr.timestamps.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimeStampCard(timeStamp: TimeStampUi, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 16.dp)
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(8.dp)
            )
            .background(Color.White)
            .padding(8.dp)

    ) {
        Text(timeStamp.title)
        Text(timeStamp.description)
        Text(text = timeStamp.date, modifier = Modifier.padding(top = 8.dp))
        Text(timeStamp.timeDifference)
    }
}

@Composable
@Preview
fun Preview() {
    TimeStampCard(
        TimeStampUi(
            title = "День рождения",
            description = "С друзьями",
            date = "15.06.2025",
            timeDifference = "Через 6 мес и 3 дня",
        )
    )
}