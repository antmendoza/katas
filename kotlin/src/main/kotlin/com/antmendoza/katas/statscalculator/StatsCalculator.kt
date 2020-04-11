package com.antmendoza.katas.statscalculator

class StatsCalculator(var listOf: List<Int>) {

    fun minimunValue(): Int {
        return this.listOf.stream().min(Integer::compare).get()
    }

    fun maximumValue(): Int {

        return this.listOf.stream().max(Integer::compare).get()
    }

    fun numberOfElements(): Int {
        return this.listOf.size
    }

    fun average(): Int {
        return this.listOf.reduce { a, v -> a + v } / this.listOf.size
    }

}
