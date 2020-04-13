package com.antmendoza.katas.fibonacci

import org.junit.Test
import kotlin.test.assertEquals


class FibonacciTest {

    //0,1, 1, 2, 3, 5, 8, 13, 21, 34”

    @Test
    fun `Should return 0 for position 0 `() {
        assertEquals(0, Fibonacci().inPosition(0))
    }



    @Test
    fun `Should return 1 for position 1 `() {
        assertEquals(1, Fibonacci().inPosition(1))
    }


    @Test
    fun `Should return 1 for position 2 `() {
        assertEquals(1, Fibonacci().inPosition(2))
    }



}

