package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MyRAM {
    val wattage = 4
    fun setupRAM() {
        Log.v("POSTING: ", "Powering RAM")
    }
}
