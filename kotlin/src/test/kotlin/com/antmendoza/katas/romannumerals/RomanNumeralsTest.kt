package com.antmendoza.katas.romannumerals


import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsTest {

    @Test
    fun `Should convert Roman number to Arabic `() {

        assertEquals("I", ArabicNumber(1).toRoman())
        assertEquals("II", ArabicNumber(2).toRoman())
        assertEquals("III", ArabicNumber(3).toRoman())
        assertEquals("IV", ArabicNumber(4).toRoman())
        assertEquals("V", ArabicNumber(5).toRoman())
        assertEquals("VI", ArabicNumber(6).toRoman())
        assertEquals("VII", ArabicNumber(7).toRoman())
        assertEquals("VIII", ArabicNumber(8).toRoman())
        assertEquals("IX", ArabicNumber(9).toRoman())
        assertEquals("X", ArabicNumber(10).toRoman())
        assertEquals("XI", ArabicNumber(11).toRoman())

        assertEquals("XVIII", ArabicNumber(18).toRoman())

        assertEquals("XIX", ArabicNumber(19).toRoman())

        assertEquals("XX", ArabicNumber(20).toRoman())
        assertEquals("XXX", ArabicNumber(30).toRoman())
        assertEquals("XL", ArabicNumber(40).toRoman())
        assertEquals("L", ArabicNumber(50).toRoman())
        assertEquals("CD", ArabicNumber(400).toRoman())
        assertEquals("DCCCLVI", ArabicNumber(856).toRoman())
        assertEquals("CM", ArabicNumber(900).toRoman())
    }

}