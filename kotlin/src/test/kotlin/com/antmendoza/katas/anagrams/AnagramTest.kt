package com.antmendoza.katas.anagrams

import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import kotlin.test.assertEquals

class AnagramTest {


    @Test
    fun `should anagram empty string`() {
        val source = "";
        val result = Anagram().generate(source)
        assertThat(result, `hasItem`(source))
    }

    @Test
    fun `should anagram one letters word`() {
        val source = "A";
        val result = Anagram().generate(source)
        assertThat(result, `hasItem`(source))
    }


    @Test
    fun `should anagram two letters word`() {
        val source = "AB";

        val result = Anagram().generate(source)

        assertThat(result, `hasItem`("AB"))
        assertThat(result, `hasItem`("BA"))
    }


    @Test
    fun `should anagram three letters word`() {
        val source = "ABC";

        val result = Anagram().generate(source)

        assertThat(result, `hasItem`("ABC"))
        assertThat(result, `hasItem`("BAC"))

        assertEquals(result.size, 6)
    }



    @Test
    fun `should anagram four letters word`() {
        val source = "ABCD";

        val result = Anagram().generate(source)

        assertThat(result, `hasItem`("ABCD"))
        assertThat(result, `hasItem`("BACD"))
        assertThat(result, `hasItem`("BDAC"))

        assertEquals(result.size, 24)
    }
}
