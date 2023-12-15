package com.example.examenraul

open class Circunferencia(var radio:Double) {
    var centro= mutableListOf<Int>()
    var punto= mutableListOf<Int>()
    constructor( centro:MutableList<Int>, punto:MutableList<Int>,radio: Double) : this(radio) {
        this.centro =centro
        this.punto = punto
        this.radio=radio
    }

    fun longitud(): Double {
        return 2*3.14159*radio
    }

    override fun toString(): String {
        return "Centro: $centro  Punto: $punto  Radio: $radio"
    }

}