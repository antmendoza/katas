package com.antmendoza.katas.statscalculator


import org.junit.Test
import kotlin.test.assertEquals

class StatsCalculatorTest {
    val sequence = listOf<Int>(3, 4, 6, 0, 7)


    @Test
    fun `Should return 0 as minimum value of the sequence `() {

        val actual = StatsCalculator(sequence).minimunValue()

        assertEquals(0, actual)
    }


    @Test
    fun `Should return 7 as maximum value of the sequence `() {

        val actual = StatsCalculator(sequence).maximumValue()

        assertEquals(7, actual)
    }

    @Test
    fun `Should return the number of elements in the sequence`() {

        val numberOfElements = StatsCalculator(sequence).numberOfElements()

        assertEquals(5, numberOfElements)
    }


    @Test
    fun `Should return the average value`() {

        val average = StatsCalculator(sequence).average()

        assertEquals(4, average)

    }

}
