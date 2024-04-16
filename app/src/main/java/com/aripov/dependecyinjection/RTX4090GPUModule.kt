package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class RTX4090GPUModule {
    @Provides
    fun providesRTX4090GPU(rtx4090: RTX_4090) :MyGPU {
        return rtx4090
    }
}