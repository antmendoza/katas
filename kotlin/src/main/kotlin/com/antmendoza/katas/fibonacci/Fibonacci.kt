package com.antmendoza.katas.fibonacci

class Fibonacci {
    fun inPosition(i: Int): Int {

        var list = listOf(0, 1)

        if (i <= list.size) {
            return list.get(i - 1)
        }

        return inPosition(i - 1) + inPosition(i - 2)

    }

}
