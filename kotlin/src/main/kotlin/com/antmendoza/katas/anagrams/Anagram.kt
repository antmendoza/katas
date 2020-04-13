package com.antmendoza.katas.anagrams

class Anagram {
    fun of(value: String): List<String> {

        if (value.length === 1) {
            return listOf(value)
        }

        if (value.length === 2) {
            return listOf(
                value.substring(0, 1) + value.substring(1, 2),
                value.substring(1, 2) + value.substring(0, 1)
            )
        }


        if (value.length === 3) {

            var result = mutableListOf<String>()
            for (i in 0..2) {
                result.add(value.substring(i, i + 1) + of(value.removeRange(i, i + 1))[0])
                result.add(value.substring(i, i + 1) + of(value.removeRange(i, i + 1))[1])
            }
            return result;

        }

        if (value.length === 4) {


            var result = mutableListOf<String>()
            for (i in value.indices) {

                var init = value.substring(i, i + 1);
                for (g in of(value.removeRange(i, i+1))) {
                    result.add(init + g)
                }

            }
            return result;


        }



        return listOf("")
    }

}
