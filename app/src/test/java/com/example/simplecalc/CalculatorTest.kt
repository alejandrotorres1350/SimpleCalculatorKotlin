package com.example.simplecalc

import org.hamcrest.CoreMatchers.`is` as Is
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    lateinit var mCalculator: Calculator


    @Before
    fun setUp(){
        mCalculator = Calculator()
    }

    @Test
    fun addTwoNumbers(){
        var resultAdd: Double = mCalculator.add(1.0, 1.0)
        assertThat(resultAdd, Is(equalTo(2.0)))
    }

    @Test
    fun addTwoNumbersNegative(){
        var resultAdd: Double = mCalculator.add(-1.0, 2.0)
        assertThat(resultAdd, Is(equalTo(1.0)))
    }

    @Test
    fun subTwoNumbers() {
        var resultSub = mCalculator.sub(1.0, 1.0)
        assertThat(resultSub, Is(equalTo(0.0)))
    }

    @Test
    fun subWorksWithNegativeResult() {
        var resultSub = mCalculator.sub(1.0, 17.0)
        assertThat(resultSub, Is(equalTo(-16.0)))
    }

    @Test
    fun mulTwoNumbers() {
        var resultMul = mCalculator.mul(32.0, 2.0)
        assertThat(resultMul, Is(equalTo(64.0)))
    }

    @Test
    fun divTwoNumbers() {
        var resultDiv = mCalculator.div(32.0,2.0)
        assertThat(resultDiv, Is(equalTo(16.0)))
    }

    @Test
    fun divTwoNumbersZero() {
        var resultDiv = mCalculator.div(32.0,0.0)
        assertThat(resultDiv, Is(equalTo(Double.POSITIVE_INFINITY)))
    }

    @Test
    fun powTwoNumbers() {
        var resultPow = mCalculator.pow(2.0,5.0)
        assertThat(resultPow, Is(equalTo(32.0)))
    }

    @Test
    fun powFirstNegative() {
        var resultPow = mCalculator.pow(-2.0,5.0)
        assertThat(resultPow, Is(equalTo(-32.0)))
    }

    @Test
    fun powSecondNegative() {
        var resultPow = mCalculator.pow(2.0,-1.0)
        assertThat(resultPow, Is(equalTo(0.5)))
    }

    @Test
    fun powFirstZero() {
        var resultPow = mCalculator.pow(0.0,5.0)
        assertThat(resultPow, Is(equalTo(0.0)))
    }

    @Test
    fun powSecondZero() {
        var resultPow = mCalculator.pow(2.0,0.0)
        assertThat(resultPow, Is(equalTo(1.0)))
    }

    @Test
    fun powZeroandOne() {
        var resultPow = mCalculator.pow(0.0,-1.0)
        assertThat(resultPow, Is(equalTo(Double.POSITIVE_INFINITY)))
    }

    @Test
    fun powFirstZeroNegative() {
        var resultPow = mCalculator.pow(0.0,-5.0)
        assertThat(resultPow, Is(equalTo(Double.POSITIVE_INFINITY)))
    }

}