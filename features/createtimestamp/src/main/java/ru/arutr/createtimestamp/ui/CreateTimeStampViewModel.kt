package ru.arutr.createtimestamp.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.text.DateFormat.SHORT
import java.text.DateFormat.getDateInstance
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class CreateTimeStampViewModel @Inject constructor() : ViewModel() {

    fun onDateChanged(date: Long?) {
        date?.let {
            Log.d("CreateTimeStampViewModel TAG", "onDateChanged: ${getDateInstance(SHORT).format(Date(date))}")
        }
    }
}