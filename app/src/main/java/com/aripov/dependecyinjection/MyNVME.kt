package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MyNVME @Inject constructor() {
    val wattage = 3
    fun setupNVME() {
        Log.v("POSTING: ", "POWER NVME")
    }
}
