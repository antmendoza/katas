package com.antmendoza.katas.tpp

import java.util.*

class BooleanTPP {
    fun fromString(s: String): Boolean {


        if (s === "TRUE") {
            return true
        }

        if (s === "FALSE") {
            return false
        }


        var token = StringTokenizer(s, " ")

        while (token.hasMoreTokens()) {
            val message = token.nextToken()
            println(message)
            if (message === "NOT") {
                val next = token.nextToken()
                println(next)
              //  return !fromString(next)
            }
            //return fromString(message)
        }


        var evalutedAsFalse = listOf("FALSE", "NOT TRUE", "FALSE OR FALSE", "TRUE AND FALSE")

        if (evalutedAsFalse.contains(s)) {
            return false
        }


        if (s === "TRUE AND FALSE AND NOT TRUE") {
            return false
        }

        return true
    }

}
