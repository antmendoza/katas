package com.antmendoza.katas.tpp

import org.junit.Test
import kotlin.test.assertEquals

class PrimeFactorTPPTest {

    @Test
    fun `should calculate primes factor`() {

        assertEquals(listOf(2), PrimeFactorTPP().calculate(2))
        assertEquals(listOf(3), PrimeFactorTPP().calculate(3))
        assertEquals(listOf(2, 2), PrimeFactorTPP().calculate(4))
        assertEquals(listOf(2, 3), PrimeFactorTPP().calculate(6))
        assertEquals(listOf(3, 3), PrimeFactorTPP().calculate(9))
        assertEquals(listOf(2, 2, 3), PrimeFactorTPP().calculate(12))
        assertEquals(listOf(3, 5), PrimeFactorTPP().calculate(15))

    }
}