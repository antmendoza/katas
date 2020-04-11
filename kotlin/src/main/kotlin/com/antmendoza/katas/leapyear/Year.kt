package com.antmendoza.katas.leapyear

class Year(var i: Int) {
    fun isLeap(): Boolean {

        val divisibleBy100 = i % 100 === 0
        val divisibleBy400 = i % 400 === 0
        if(divisibleBy4() && (!divisibleBy100 || (divisibleBy100 && divisibleBy400))){
            return true
        }

        return false
    }

    private fun divisibleBy4() = i % 4 === 0

}
