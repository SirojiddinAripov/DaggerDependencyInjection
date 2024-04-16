package com.aripov.dependecyinjection

import dagger.Component

@Component(modules = [
    PSUModule::class,
    StorageModule::class,
    NVMEModule::class
])
interface ComputerComponent {
    fun getComputer() : MyCOMPUTER
}