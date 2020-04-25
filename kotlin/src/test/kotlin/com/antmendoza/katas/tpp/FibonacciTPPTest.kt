package com.antmendoza.katas.tpp

import org.junit.Test
import kotlin.test.assertEquals

class FibonacciTPPTest {


    @Test
    fun `should init fibonacci in position`() {

        assertEquals(0, FibonacciTPP().inPosition(0))
        assertEquals(1, FibonacciTPP().inPosition(1))
        assertEquals(1, FibonacciTPP().inPosition(2))
        assertEquals(2, FibonacciTPP().inPosition(3))
        assertEquals(3, FibonacciTPP().inPosition(4))
        assertEquals(5, FibonacciTPP().inPosition(5))
        assertEquals(8, FibonacciTPP().inPosition(6))

    }
}