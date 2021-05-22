package com.example.lasson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lasson_4.data.Car
import com.example.lasson_4.data.Tank


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logD("Valera")
        val tank1 = Tank(12f)
        val tank2 = Tank(35f)
        val car: Car = Car (25,12, 34, tank2, 24)
         logD( "" +car.probeg )

    }
}