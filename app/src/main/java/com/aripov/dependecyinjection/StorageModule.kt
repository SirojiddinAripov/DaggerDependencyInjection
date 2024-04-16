package com.aripov.dependecyinjection

import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun providesStorage(): MySTORAGE {
        return MySTORAGE(MyNVME())
    }
}