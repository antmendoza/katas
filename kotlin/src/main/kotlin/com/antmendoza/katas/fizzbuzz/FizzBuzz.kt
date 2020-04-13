package com.antmendoza.katas.fizzbuzz

class FizzBuzz(var i: Int) {
    fun print(): String {

        if (isMultipleOfFive() && isMultipleOfThree()) {
            return "FizzBuzz";
        }

        if (isMultipleOfFive()) {
            return "Buzz";
        }

        if (isMultipleOfThree()) {
            return "Fizz";
        }

        return this.i.toString();

    }

    private fun isMultipleOfFive() = this.i % 5 === 0

    private fun isMultipleOfThree() = this.i % 3 === 0

}
