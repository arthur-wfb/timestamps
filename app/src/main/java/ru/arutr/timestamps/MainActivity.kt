package ru.arutr.timestamps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.arutr.timestamps.main.ui.FutureTimeStampsScreen
import ru.arutr.timestamps.main.ui.TimeStampUi
import ru.arutr.timestamps.ui.theme.TimeStampsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeStampsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    FutureTimeStampsScreen(
                        listOf(
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                            TimeStampUi(
                                title = "День рождения",
                                description = "С друзьями",
                                date = "15.06.2025",
                                timeDifference = "Через 6 мес и 3 дня",
                            ),
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}