package com.antmendoza.katas.fizzbuzz

import org.junit.Test
import kotlin.test.assertEquals


class FizzBuzzTest {

    //“Write a function that takes numbers from 1 to 100 and outputs them as a string,
    // but for multiples of three it returns “Fizz” instead of the number, and for multiples of five it returns “Buzz.”
    // For numbers that are multiples of both three and five, it returns “FizzBuzz.”


    @Test
    fun `should print 1 as string`() {
        val result = FizzBuzz(1).print()
        assertEquals(result, "1");
    }

    @Test
    fun `should print 2 as string`() {
        val result = FizzBuzz(2).print()
        assertEquals(result, "2");
    }


    @Test
    fun `should print Fizz where input is 3`() {
        val result = FizzBuzz(3).print()
        assertEquals(result, "Fizz");
    }

    @Test
    fun `should print Fizz where input is 6`() {
        val result = FizzBuzz(6).print()
        assertEquals(result, "Fizz");
    }

    @Test
    fun `should print Fizz where input is 9`() {
        val result = FizzBuzz(9).print()
        assertEquals(result, "Fizz");
    }

}
