package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class PSUModule {
    @Provides
    fun providesPSU(): MyPSU {
        return MyPSU(MyMOTHERBOARD(MyCPU(), MyGPU(), MyRAM(), MySTORAGE(MyNVME())))
    }
}