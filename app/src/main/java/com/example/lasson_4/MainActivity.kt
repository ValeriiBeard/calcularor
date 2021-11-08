package com.example.lasson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.lasson_4.data.dataCar
import com.example.lasson_4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding
   private val dataCartest: dataCar by viewModels()



   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dataCartest.dataCartest.observe(this, {

        })


       var btCreatFragment = binding.btCreatFrag


       btCreatFragment.setOnClickListener( ) {
           supportFragmentManager
               .beginTransaction()
               .replace(R.id.plaseHolder, MainFragment () )
               .commit()
       }


    }




}


