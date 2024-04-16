package com.aripov.dependecyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var myComputer : MyCOMPUTER
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Logging Delination
        Log.v("POSTING: ", "-------NEW CYCLE-------")
        //Dependency Injection Using Dagger
        DaggerComputerComponent
            .builder()
            .rAMModule(RAMModule(16))
            .build()
            .inject(this)
        myComputer.bootComputer()

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