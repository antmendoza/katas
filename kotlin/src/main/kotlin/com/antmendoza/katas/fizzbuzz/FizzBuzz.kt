package com.antmendoza.katas.fizzbuzz

class FizzBuzz(var i: Int) {
    fun print(): String {

        if (this.i%5 === 0) {
            return "Buzz";
        }

        if (this.i % 3 === 0) {
            return "Fizz";
        }






        return this.i.toString();

    }

}
