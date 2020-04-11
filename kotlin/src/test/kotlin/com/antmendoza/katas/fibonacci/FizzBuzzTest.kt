package com.antmendoza.katas.fibonacci


import com.antmendoza.katas.fibonacci.FizzBuzz
import org.junit.Test
import kotlin.test.assertEquals


class FizzBuzzTest {

    //“Write a function that takes numbers from 1 to 100 and outputs them as a string,
    // but for multiples of three it returns “Fizz” instead of the number, and for multiples of five it returns “Buzz.”
    // For numbers that are multiples of both three and five, it returns “FizzBuzz.”


    @Test
    fun `should initialize class`() {
        var fizzBuzz = FizzBuzz(3)
    }

    @Test
    fun `should return Fizz for 3`() {
        var expected = FizzBuzz(3).print()
        val actual = "Fizz"
        assertEquals(expected, actual)
    }

    @Test
    fun `should return Fizz for 6`() {
        var expected = FizzBuzz(6).print()
        val actual = "Fizz"
        assertEquals(expected, actual)
    }


    @Test
    fun `should return Fizz for 9`() {
        var expected = FizzBuzz(9).print()
        val actual = "Fizz"
        assertEquals(expected, actual)
    }


    @Test
    fun `should return Buzz for 5`() {
        var expected = FizzBuzz(5).print()
        val actual = "Buzz"
        assertEquals(expected, actual)
    }


    @Test
    fun `should return Buzz for 10`() {
        var expected = FizzBuzz(10).print()
        val actual = "Buzz"
        assertEquals(expected, actual)
    }


    @Test
    fun `should return FizzBuzz for 15`() {
        var expected = FizzBuzz(15).print()
        val actual = "FizzBuzz"
        assertEquals(expected, actual)
    }


    @Test
    fun `should return Buzz for 1`() {
        var expected = FizzBuzz(1).print()
        val actual = "1"
        assertEquals(expected, actual)
    }


}
