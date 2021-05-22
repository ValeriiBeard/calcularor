package com.example.lasson_4.data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lasson_4.MainActivity
import com.example.lasson_4.databinding.ActivitySchetchickBinding

class Schetchick : AppCompatActivity() {
    lateinit var bindingClass : ActivitySchetchickBinding
    val titleProbeg:String = "введіть пробіг"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySchetchickBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        var nameCar = "Honda AA 00 11 AA"
        var gasStart: Float =15.6f
        var startProbeg =168555
        var basNormCar:Float = 8.6f
        var rozhodDayCar: Float?=null

//        var honda = Car ()

        bindingClass.btSchet.setOnClickListener( ) {}
        fun onClickSchet (view: View ){
        val i = Intent (this, MainActivity :: class.java)

        }
//        var userStyProbeg



        fun schchetchikDay () {
//            userStyProbeg = honda.probegDayCityt
//            honda.probegDayStart = startProbeg
//            honda.probegDayFinish = honda.probegDayStart+ honda.probegDayCityt

        }

        bindingClass.nameCar.text =nameCar
        bindingClass.gasCar.text = "$gasStart"
        bindingClass.probegCar.text = "$startProbeg"
        bindingClass.probegDay.hint = titleProbeg


    }

//    private fun Car(): Car {
//    }


}



