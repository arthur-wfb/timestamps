package ru.arutr.timestamps

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TimeStampApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}