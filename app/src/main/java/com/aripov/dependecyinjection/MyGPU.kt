package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MyGPU @Inject constructor(){
    val wattage = 500
    fun setupGPU() {
        Log.v("POSTING: ", "Powering the GPU")
    }
}
