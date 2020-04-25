package com.antmendoza.katas.tpp


var romanNumbersMap = mapOf(
    1 to "I",
    4 to "IV",
    5 to "V",
    9 to "IX",
    10 to "X",
    10 to "X",
    40 to "XL",
    50 to "L",
    90 to "XC",
    100 to "C",
    400 to "CD",
    500 to "D",
    900 to "CM"
)

val reversed = romanNumbersMap.keys.reversed()


class ArabicNumberTPP(var number: Int) {
    fun toRoman(): String {

        checkIfConvertible(number)

        if (romanNumbersMap.containsKey(number)) {
            return romanNumbersMap.get(number).toString()
        }

        var currentKey = 1;

        var itKeys = reversed.iterator();
        while (itKeys.hasNext()) {
            val key = itKeys.next()
            if (number > key) {
                currentKey = key;
                break;
            }
        }
        return romanNumbersMap.get(currentKey) + ArabicNumberTPP(number - currentKey).toRoman();

    }


    companion object {
        private fun checkIfConvertible(
            number: Int) {
            if (number > reversed.iterator().next()) {
                throw Exception("Not implemented ");
            }
        }
    }


}
