package ru.arutr.timestamps.navigation

import kotlinx.serialization.Serializable

sealed class Route {

    @Serializable
    data object Main: Route()

    @Serializable
    data object CreateTimeStamp: Route()
}

