package com.antmendoza.katas.tpp

class FibonacciTPP {

    fun inPosition(i: Int): Int {

        var list = mapOf(
            0 to 0,
            1 to 1
        )

        if (list.containsKey(i)) {
            return list.get(i)!!
        }

        return inPosition(i - 1) + inPosition(i - 2)
    }

}
