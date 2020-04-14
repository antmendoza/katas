package com.antmendoza.katas.anagrams

class Anagram {
    fun of(source: String): List<String> {


        if (source.length <= 1) {
            return mutableListOf(source)

        }

        if (source.length === 2) {
            var result = mutableListOf<String>()
            result.add(source.substring(0, 1) + source.substring(1, 2))
            result.add(source.substring(1, 2) + source.substring(0, 1))
            return result
        }


        val result = mutableListOf<String>()
        for (i in 0..source.length - 1) {
            val variable = of(source.removeRange(i, i + 1))
            for (v in variable) {
                result.add(source.substring(i, i + 1) + v)
            }
        }
        return result


    }

}
