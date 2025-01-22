package ru.arutr.createtimestamp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.arutr.common.theme.TimeStampsTheme

@Composable
fun CreateTimeStampScreen() {
    Content()
}

@Composable
private fun Content() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 16.dp)
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter title") },
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter description") },
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { },
            content = { Text(text = "Choose date") }
        )
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Preview() {
    TimeStampsTheme {
        Content()
    }
}