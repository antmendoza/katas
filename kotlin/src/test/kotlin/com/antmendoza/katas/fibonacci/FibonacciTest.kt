package com.antmendoza.katas.fibonacci

import org.junit.Test
import kotlin.test.assertEquals


class FibonacciTest {

    //0,1, 1, 2, 3, 5, 8, 13, 21, 34”

    @Test
    fun `Should return 0 for position 1 `() {
        assertEquals(0, Fibonacci().inPosition(1))
    }



    @Test
    fun `Should return 1 for position 2 `() {
        assertEquals(1, Fibonacci().inPosition(2))
    }


    @Test
    fun `Should return 1 for position 3 `() {
        assertEquals(1, Fibonacci().inPosition(3))
    }

    @Test
    fun `Should return 2 for position 4 `() {
        assertEquals(2, Fibonacci().inPosition(4))
    }


    @Test
    fun `Should return 3 for position 5 `() {
        assertEquals(3, Fibonacci().inPosition(5))
    }

    @Test
    fun `Should return 5 for position 6 `() {
        assertEquals(5, Fibonacci().inPosition(6))
    }

    @Test
    fun `Should return 21 for position 9 `() {
        assertEquals(21, Fibonacci().inPosition(9))
    }



}

