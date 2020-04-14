package com.antmendoza.katas.romannumerals

class ArabicNumber(var value: Int) {
    fun toRoman(): String {


        var result = "";

        for (i in 1..value) {
            result += "I"
        }
        return result

    }


}
