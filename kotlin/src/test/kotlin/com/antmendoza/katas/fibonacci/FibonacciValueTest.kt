package com.antmendoza.katas.fibonacci

import org.junit.Test
import kotlin.test.assertEquals


class FibonacciValueTest {


    @Test
    fun `Should initialize class `() {
        var instance = FibonacciValue(MockFibonacci())
    }


    @Test
    fun `Should calculate fibonacci in position 3 `() {
        var fibonacci = FibonacciValue(MockFibonacci()).inPosition(3)

        assertEquals(2, fibonacci)

    }


    @Test
    fun `Should calculate fibonacci in position 0 `() {
        var fibonacci = FibonacciValue(MockFibonacci()).inPosition(0)

        assertEquals(0, fibonacci)

    }

    @Test
    fun `Should calculate fibonacci in position 6 `() {
        var fibonacci = FibonacciValue(MockFibonacci()).inPosition(6)

        assertEquals(8, fibonacci)

    }


}


private class MockFibonacci : Fibonacci() {

    override fun serie(): List<Int> {
        return listOf<Int>(0, 1, 1, 2, 3, 5, 8, 13)
    }

}
