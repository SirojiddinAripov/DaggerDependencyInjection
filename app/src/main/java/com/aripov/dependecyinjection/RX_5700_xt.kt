package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject
class RX_5700_xt @Inject constructor() : MyGPU {
    val wattage = 500
    override fun setupGPU() {
        Log.v("POSTING: ", "Powering the GPU: RX 5700 xt")
    }
}
