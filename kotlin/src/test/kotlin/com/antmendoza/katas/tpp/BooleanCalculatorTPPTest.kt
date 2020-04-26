package com.antmendoza.katas.tpp

import org.junit.Test
import kotlin.test.assertEquals

class BooleanCalculatorTPPTest {


    @Test
    fun `should translate to boolean`() {
        assertEquals(true, BooleanTPP().fromString("TRUE"))
        assertEquals(false, BooleanTPP().fromString("FALSE"))

    }

    @Test
    fun `should support not operator`() {
        assertEquals(true, BooleanTPP().fromString("NOT FALSE"))
        assertEquals(false, BooleanTPP().fromString("NOT TRUE"))
    }

    @Test
    fun `should support or`() {
        assertEquals(true, BooleanTPP().fromString("TRUE OR FALSE"))
        assertEquals(false, BooleanTPP().fromString("FALSE OR FALSE"))
    }


    @Test
    fun `should support and`() {
        assertEquals(false, BooleanTPP().fromString("TRUE AND FALSE"))
        assertEquals(true, BooleanTPP().fromString("TRUE AND TRUE"))

    }

    @Test
    fun `should support several operators with the following precedence not, and, or, `() {
        assertEquals(true, BooleanTPP().fromString("TRUE OR TRUE OR TRUE AND FALSE"))
        assertEquals(true, BooleanTPP().fromString("TRUE OR FALSE AND NOT FALSE"))
        assertEquals(false, BooleanTPP().fromString("TRUE AND FALSE AND NOT TRUE"))
        assertEquals(true, BooleanTPP().fromString("FALSE AND FALSE OR TRUE"))
        assertEquals(true, BooleanTPP().fromString("FALSE OR FALSE OR TRUE"))
    }


    @Test
    fun `should support parenthesis `() {
        assertEquals(true, BooleanTPP().fromString("(FALSE AND FALSE) OR TRUE"))
        assertEquals(true, BooleanTPP().fromString("(TRUE OR FALSE) AND TRUE"))
        assertEquals(true, BooleanTPP().fromString("(TRUE OR FALSE OR (TRUE OR FALSE)) AND TRUE"))
    }



}


