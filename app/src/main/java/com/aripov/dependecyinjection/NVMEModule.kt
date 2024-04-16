package com.aripov.dependecyinjection

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class NVMEModule {
        @Provides
        fun providesNVME(): MyNVME {
            return MyNVME()
        }
}