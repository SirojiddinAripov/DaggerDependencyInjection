package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class RX5700xtGPUModule {
    @Provides
    fun providesRX5700xtGPU(rx5700Xt: RX_5700_xt) : MyGPU {
        return rx5700Xt
    }
}