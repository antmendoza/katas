package com.antmendoza.katas.anagrams

import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import kotlin.test.assertEquals

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
    fun `should anagram a word of one character`() {
        assertThat(Anagram().of("A"), `hasItem`("A"))
        assertThat(Anagram().of("B"), `hasItem`("B"))
        assertThat(Anagram().of("C"), `hasItem`("C"))
    }


    @Test
    fun `should anagram a word of two character`() {
        assertThat(Anagram().of("AB"), `hasItem`("AB"))
        assertThat(Anagram().of("AB"), `hasItem`("BA"))
    }


    @Test
    fun `should anagram a word of three character`() {
        val of = Anagram().of("ABC")
        assertThat(of, `hasItem`("ABC"))
        assertThat(of, `hasItem`("ACB"))
        assertThat(of, `hasItem`("BCA"))
        assertThat(of, `hasItem`("BAC"))
        assertThat(of, `hasItem`("CBA"))
        assertThat(of, `hasItem`("CAB"))
    }


    @Test
    fun `should anagram a word of four character`() {
        val of = Anagram().of("ABCD")
        assertThat(of, `hasItem`("ABCD"))
        assertThat(of, `hasItem`("ABDC"))
        assertThat(of, `hasItem`("ACBD"))
        assertThat(of, `hasItem`("ACDB"))
        assertThat(of, `hasItem`("ADCB"))

        assertThat(of, `hasItem`("BACD"))
        assertThat(of, `hasItem`("BADC"))
        assertThat(of, `hasItem`("BCDA"))
        assertThat(of, `hasItem`("BCAD"))

        println(of)
        assertEquals( 24, of.size)
    }




}
