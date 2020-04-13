package com.antmendoza.katas.fibonacci

class Fibonacci {
    fun inPosition(i: Int): Int {



        var list = listOf<Int>(0,1,1,2,3)

        if(i <= list.size){
            return list.get(i-1)
        }

        return 0
    }

}
