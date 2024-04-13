package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MyCPU @Inject constructor(){
    val wattage = 400
    fun setupCPU() {
        Log.v("POSTING: ", "Powering the CPU")
    }
}
