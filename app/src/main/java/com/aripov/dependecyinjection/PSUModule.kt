package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class PSUModule {
    @Provides
    fun providesPSU(): MyPSU {
        return MyPSU(MyMOTHERBOARD(MyCPU(), RX_5700_xt(), MyRAM(), MySTORAGE(MyNVME())))
    }
}