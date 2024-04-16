package com.aripov.dependecyinjection

import android.util.Log
import javax.inject.Inject

class MySTORAGE (
    private val nvmeDrive: MyNVME
) {
    val wattage = nvmeDrive.wattage
    fun setupStorage() {
        Log.v("POSTING: ", "Init storage")
        nvmeDrive.setupNVME()
    }
}
