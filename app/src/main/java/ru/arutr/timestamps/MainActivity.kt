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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.arutr.createtimestamp.ui.CreateTimeStampScreen
import ru.arutr.timestamps.main.ui.FutureTimeStampsScreen
import ru.arutr.timestamps.main.ui.TimeStampUi
import ru.arutr.timestamps.navigation.Route
import ru.arutr.timestamps.ui.theme.TimeStampsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            TimeStampsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Route.Main) {
                        composable<Route.Main> {
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
                                ),
                                onCreateButtonClick = { navController.navigate(route = Route.CreateTimeStamp) }
                            )
                        }
                        composable<Route.CreateTimeStamp> {
                            CreateTimeStampScreen()
                        }
                    }

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