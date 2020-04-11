package com.antmendoza.katas.fibonacci


class FibonacciValue (var fibonacci: Fibonacci){

    fun inPosition(position: Int): Int {

        return fibonacci.serie().get(position)

    }


}
