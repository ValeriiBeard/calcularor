package com.example.lasson_4.data

import com.example.lasson_4.logD

open class Tank(open var capacity: Float) {
    companion object {
        const val MAX_LIMIT = 60
        const val MIN_LIMIT = 0
    }

    init {
        if (capacity <= MIN_LIMIT || capacity >= MAX_LIMIT) {
           logD("Error_Tank")

            throw IllegalArgumentException()
        }
        logD( "SUCCESS")
    }

}