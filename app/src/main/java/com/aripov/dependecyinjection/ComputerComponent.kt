package com.aripov.dependecyinjection

import dagger.Component

@Component
interface ComputerComponent {
    fun getComputer() : MyCOMPUTER
}