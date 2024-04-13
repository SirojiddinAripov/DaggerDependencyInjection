package com.aripov.dependecyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Dependency Injection Using Dagger
        val myComputer = DaggerComputerComponent
            .create()
            .getComputer()
            .bootComputer()

        //Manual Constructor Injection
//        val myMotherboard = MyMOTHERBOARD(
//            MyCPU(),
//            MyGPU(),
//            MyRAM(),
//            MySTORAGE(MyNVME()),
//        )
//        val myPowerSupply = MyPSU(
//            myMotherboard
//        )
//        val myComputer = MyCOMPUTER(
//            myMotherboard,
//            myPowerSupply
//        )
//
//        myComputer.bootComputer()
    }
}