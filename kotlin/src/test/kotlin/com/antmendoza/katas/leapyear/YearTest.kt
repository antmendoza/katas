package com.antmendoza.katas.leapyear

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertFalse

class YearTest {

    @Test
    fun `should initialize class`() {
        var year = Year(0)
    }


    @Test
    fun `should identify 2001 as a common year`() {
        var isLeapYear = Year(2001).isLeap()
        assertFalse(isLeapYear)
    }

    @Test
    fun `should identify 1900 as a common year`() {
        var isLeapYear = Year(1900).isLeap()
        assertFalse(isLeapYear)
    }


    @Test
    fun `should identify 1996 as a leap year`() {
        var isLeapYear = Year(1996).isLeap()
        assertTrue(isLeapYear)
    }


    @Test
    fun `should identify 2000 as a leap year`() {
        var isLeapYear = Year(2000).isLeap()
        assertTrue(isLeapYear)
    }


}
