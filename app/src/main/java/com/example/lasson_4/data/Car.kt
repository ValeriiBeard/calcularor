package com.example.lasson_4.data

 open class Car(
    open var probegDayStart: Int,
    open var probegDayCity: Int,
    open var probegDayFinish: Int,
    open var tank: Tank ,
    open var carconf: confNorm
) {
    fun probegVecherom(): Int = probegDayStart + probegDayCity
     fun usesGasCity (): Float = carconf.normCity * probegDayCity.toFloat() /100
     fun usesGasHiway (): Float = carconf.normHiway * probegDayCity.toFloat() /100



}