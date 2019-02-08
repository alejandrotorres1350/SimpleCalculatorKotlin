package com.example.simplecalc

import kotlin.math.pow

class Calculator {

    enum class Operator { ADD, SUB, DIV, MUL, POW }

    fun add(firstOpperand: Double, secondOperand: Double): Double {
        return firstOpperand + secondOperand
    }
    fun sub(firstOpperand: Double, secondOperand: Double): Double{
        return firstOpperand - secondOperand
    }
    fun div(firstOpperand: Double, secondOperand: Double): Double{

        return firstOpperand / secondOperand
    }
    fun mul(firstOpperand: Double, secondOperand: Double): Double{
        return firstOpperand * secondOperand
    }

    fun pow(firstOpperand: Double, secondOperand: Double): Double{
        return firstOpperand.pow(secondOperand)
    }
}