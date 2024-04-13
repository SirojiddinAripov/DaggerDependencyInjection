package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MyMOTHERBOARD @Inject constructor(
    val cpu: MyCPU,
    val gpu: MyGPU,
    val ram: MyRAM,
    val storage: MySTORAGE,
) {
    val wattage = 40
    fun setupMotherboard() {
        Log.v("POSTING: ", "Powering the motherboard.")
    }
}