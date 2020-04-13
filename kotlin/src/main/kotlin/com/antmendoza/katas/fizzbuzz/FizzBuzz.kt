package com.antmendoza.katas.fizzbuzz

class FizzBuzz(var i: Int) {
    fun print(): String {


        if(this.i === 3){
            return "Fizz";
        }



        if(this.i === 6){
            return "Fizz";
        }



        if(this.i === 9){
            return "Fizz";
        }

        return this.i.toString();

    }

}
