package com.example.examenraul

import kotlin.math.pow

class Circulo(radio:Double = 0.0, var color:String = ""): Circunferencia(radio) {

    constructor(centro:MutableList<Int>,punto:MutableList<Int>,color:String): this() {
        this.centro=centro
        this.color=color
        this.punto=punto
    }

    fun area(): Double {
        return 3.14159*radio.pow(2)
    }

    override fun toString(): String {
        return super.toString()+" Color: $color"
    }

}