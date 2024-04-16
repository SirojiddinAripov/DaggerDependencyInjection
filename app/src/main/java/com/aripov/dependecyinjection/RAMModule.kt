package com.aripov.dependecyinjection

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class RAMModule(val sizeInGB: Int) {
    @Provides
    fun providesRAM() : MyRAM {
        Log.v("POSTING: ", "The ram size is ${sizeInGB}GB.")
        return MyRAM()
    }
}