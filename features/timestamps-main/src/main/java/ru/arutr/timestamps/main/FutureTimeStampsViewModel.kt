package ru.arutr.timestamps.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.arutr.timestamps.data.model.TimeStamp

internal class FutureTimeStampsViewModel: ViewModel() {

    private val _state = MutableStateFlow(State.None)
    val state: StateFlow<State>
        get() = _state.asStateFlow()
}

sealed class State {
    data object None: State()
    class Loading: State()
    class Error: State()
    class Success(val timeStamps: List<TimeStamp>): State()
}