package com.antmendoza.katas.fibonacci

open class Fibonacci {

    open fun serie(): List<Int> {
        return listOf<Int>()
    }

    fun inPosition(i: Int): Int {
        if (i === 0) {
            return 0
        }
        if (i === 1) {
            return 1
        }

        return Fibonacci().inPosition(i - 1) +
                Fibonacci().inPosition(i - 2)
    }
}
