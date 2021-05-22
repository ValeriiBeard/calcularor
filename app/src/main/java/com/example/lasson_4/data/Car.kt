package com.example.lasson_4.data

class Car(
    var probegDayStart: Int,
    var probegDayCityt: Int,
    var probegDayFinish: Int,
    var tank: Tank,
    val startoviyProbeg: Int,
    val probegZaDen: Int
) {
    fun probegVecherom(): Int = startoviyProbeg + probegZaDen

}