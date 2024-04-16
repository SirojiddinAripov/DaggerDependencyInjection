package com.aripov.dependecyinjection

import dagger.Component

@Component(modules = [
    PSUModule::class,
    StorageModule::class,
    NVMEModule::class,
    RAMModule::class,
    RTX4090GPUModule::class
])
interface ComputerComponent {
//    fun getComputer() : MyCOMPUTER
    fun inject(mainActivity: MainActivity)
    //if this component is to be used elsewhere you need to declare that for each.
}