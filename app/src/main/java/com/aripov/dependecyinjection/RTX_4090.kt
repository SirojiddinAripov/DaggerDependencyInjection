package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class RTX_4090 @Inject constructor() : MyGPU {
    override fun setupGPU() {
        Log.v("POSTING: ", "Powering GPU: RTX 4090")
    }

    override fun wattage(): Int { return 500 }
}