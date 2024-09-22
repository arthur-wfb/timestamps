package ru.arutr.timestamps.main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FutureTimeStampsScreen(timeStamps: List<TimeStampUi> = listOf()) {
    Scaffold(
        floatingActionButton = { CreateNewButton(onClick = {}) },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        LazyVerticalGrid(
            columns = GridCells.FixedSize(180.dp), modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(timeStamps) { timeStamp ->
                TimeStampCard(timeStamp)
            }
        }
    }
}
