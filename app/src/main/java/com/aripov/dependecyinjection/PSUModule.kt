package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class PSUModule {
    @Provides
    fun providesPSU(): MyPSU {
        return MyPSU(MyMOTHERBOARD(MyCPU(), RTX_4090(), MyRAM(), MySTORAGE(MyNVME())))
    }
}