package com.antmendoza.katas.romannumerals

class ArabicNumber(var value: Int) {
    fun toRoman(): String {





        if (value === 4) {
            return "IV"
        }


        if (value === 9) {
            return "IX"
        }

        if (value >= 5  && value < 10) {
            return "V" + ArabicNumber(value-5).toRoman()
        }


        if (value >= 10  && value <= 20) {
            return "X" + ArabicNumber(value-10).toRoman()
        }



        var result = "";
        for (i in 1..value) {
            result += "I"
        }
        return result

    }


}
