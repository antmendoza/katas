package com.antmendoza.katas.romannumerals

class ArabicNumber(var value: Int) {
    fun toRoman(): String {

        var base = mapOf(
            1000 to "M"
            ,
            900 to "CM"
            ,
            500 to "D"
            ,
            400 to "CD"
            ,
            100 to "C"
            ,
            50 to "L"
            ,
            40 to "XL"
            ,
            10 to "X"
            ,
            9 to "IX"
            ,
            5 to "V"
            ,
            4 to "IV"
            ,
            1 to "I"
        )


        var result = "";
        for (b in base) {
            if (value / b.key > 0 && result === "") {
                result = b.value + ArabicNumber(value - b.key).toRoman()
            }
        }
        return result

    }


}
