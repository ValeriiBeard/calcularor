package com.example.lasson_4.data

 open class Car(
    open var probegDayStart: Int,
    open var probegDayCityt: Int,
    open var probegDayFinish: Int,
    open var tank: Tank
) {
    fun probegVecherom(): Int = probegDayStart + probegDayCityt


}