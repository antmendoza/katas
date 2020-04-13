package com.antmendoza.katas.anagrams

class Anagram {
    fun of(value: String): List<String> {

        if (value.length <= 1) {
            return listOf(value)
        }

        if (value.length === 2) {
            return listOf(
                value.substring(0, 1) + value.substring(1, 2),
                value.substring(1, 2) + value.substring(0, 1)
            )
        }


        var result = mutableListOf<String>()
        for (i in value.indices) {
            var init = value.substring(i, i + 1);
            for (g in of(value.removeRange(i, i + 1))) {
                result.add(init + g)
            }
        }
        return result;


    }

}
