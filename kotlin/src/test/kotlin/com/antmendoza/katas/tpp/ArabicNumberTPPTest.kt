package com.antmendoza.katas.tpp

import org.junit.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception
import kotlin.test.assertEquals


class ArabicNumberTPPTest {


    @Test
    fun `should convert arabic numbers to roman`(){

        assertEquals("I", ArabicNumberTPP(1).toRoman())
        assertEquals("II", ArabicNumberTPP(2).toRoman())
        assertEquals("III", ArabicNumberTPP(3).toRoman())
        assertEquals("IV", ArabicNumberTPP(4).toRoman())
        assertEquals("V", ArabicNumberTPP(5).toRoman())
        assertEquals("VII", ArabicNumberTPP(7).toRoman())
        assertEquals("VIII", ArabicNumberTPP(8).toRoman())
        assertEquals("IX", ArabicNumberTPP(9).toRoman())
        assertEquals("X", ArabicNumberTPP(10).toRoman())
        assertEquals("XI", ArabicNumberTPP(11).toRoman())
        assertEquals("DCCCXLVI", ArabicNumberTPP(846).toRoman())
    }


    @Test(expected = Exception::class)
    fun `should throw an exception when is not able to convert number`(){
        ArabicNumberTPP(1846).toRoman()

    }

}