package com.antmendoza.katas.tpp

class PrimeFactorTPP {
    fun calculate(i: Int): List<Int> {

        var primes = listOf(2, 3, 5);
        for (prime in primes) {
            if (i > prime && i % prime === 0) {
                val result = mutableListOf(prime)
                result.addAll(calculate(i / prime))
                return result;
            }
        }

        return listOf(i);
    }

}
