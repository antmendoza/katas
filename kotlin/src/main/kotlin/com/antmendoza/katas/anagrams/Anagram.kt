package com.antmendoza.katas.anagrams


class Anagram() {
    fun generate(source: String): List<String> {


        if (source.length <= 1) {
            return mutableListOf(source);
        }


        if (source.length === 2) {
            var result = mutableListOf<String>()
            result.add(source[0] + "" + source[1])
            result.add(source[1] + "" + source[0])
            return result
        }


        var result = mutableListOf<String>()
        for (i in source.indices) {
            val generate = generate(removerPosition(source, i))
            for (g in generate) {
                result.add(valueInPosition(source, i) + g)
            }
        }

        return result


    }

    private fun removerPosition(source: String, i: Int): String {
        return source.removeRange(i, i + 1)
    }

    private fun valueInPosition(source: String, i: Int): String {
        return source.substring(i, i + 1)
    }


}
