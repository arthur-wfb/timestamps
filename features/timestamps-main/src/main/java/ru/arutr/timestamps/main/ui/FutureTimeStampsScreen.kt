package ru.arutr.timestamps.main.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun FutureTimeStampsScreen(timeStamps: List<TimeStampUi> = listOf()) {

    LazyVerticalGrid(columns = GridCells.Adaptive(140.dp)) {
        items(timeStamps) { timeStamp ->
            TimeStampCard(timeStamp)
        }
    }
}
