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
    fun `should print Fizz for multiples of three`() {
        assertEquals(FizzBuzz(3).print(), "Fizz");
        assertEquals(FizzBuzz(6).print(), "Fizz");
        assertEquals(FizzBuzz(9).print(), "Fizz");
    }


    @Test
    fun `should print Buzz for multiples of five`() {
        assertEquals(FizzBuzz(5).print(), "Buzz");
        assertEquals(FizzBuzz(10).print(), "Buzz");
        assertEquals(FizzBuzz(20).print(), "Buzz");
    }

    @Test
    fun `should print FizzBuzz for multiples of both three and five`() {
        assertEquals(FizzBuzz(15).print(), "FizzBuzz");
        assertEquals(FizzBuzz(30).print(), "FizzBuzz");
        assertEquals(FizzBuzz(45).print(), "FizzBuzz");
    }



}
