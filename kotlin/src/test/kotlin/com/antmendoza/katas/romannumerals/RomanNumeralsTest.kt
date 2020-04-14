package com.antmendoza.katas.romannumerals


import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsTest {

    @Test
    fun `Should convert number 1 to Arabic `() {
        assertEquals("I", ArabicNumber(1).toRoman())
    }

    @Test
    fun `Should convert number 2 to Arabic `() {
        assertEquals("II", ArabicNumber(2).toRoman())
    }

    @Test
    fun `Should convert number 3 to Arabic `() {
        assertEquals("III", ArabicNumber(3).toRoman())
    }
}