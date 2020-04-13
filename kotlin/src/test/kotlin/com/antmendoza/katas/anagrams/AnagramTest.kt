package com.antmendoza.katas.anagrams

import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/*
    Anagrams by cyber-dojo
    Write a program to generate all potential anagrams of an input string
    For example, the potential anagrams of “biro” are:
    biro bior brio broi boir bori
    ibro ibor irbo irob iobr iorb
    rbio rboi ribo riob roib robi
    obir obri oibr oirb orbi orib”
*/

class AnagramTest {


    @Test
    fun `should anagram empty string`() {
        val result = Anagram().of("")
        assertThat(result, `hasItem`(""))
    }


    @Test
    fun `should anagram a single letter`() {
        assertThat(Anagram().of("A"), `hasItem`("A"))
        assertThat(Anagram().of("B"), `hasItem`("B"))
        assertThat(Anagram().of("C"), `hasItem`("C"))
    }


    @Test
    fun `should anagram a word of two letters`() {
        assertThat(Anagram().of("AB"), `hasItem`("AB"))
        assertThat(Anagram().of("AB"), `hasItem`("BA"))
    }




}
