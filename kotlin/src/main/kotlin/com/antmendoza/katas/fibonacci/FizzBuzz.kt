package com.antmendoza.katas.fibonacci

class FizzBuzz(var i: Int) {
    fun print(): String {


        val multipleOf3 = multipleOf(3)
        val multipleOf5 = multipleOf(5)


        if (multipleOf3 && multipleOf5) {
            return "FizzBuzz"
        }


        if (multipleOf3) {
            return "Fizz"
        }

        if (multipleOf5) {
            return "Buzz"
        }


        return i.toString()
    }

    private fun multipleOf(i1: Int) = i % i1 === 0

}
