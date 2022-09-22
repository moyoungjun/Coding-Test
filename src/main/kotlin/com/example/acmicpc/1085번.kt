package com.example.acmicpc

import java.util.*
import kotlin.collections.ArrayList


fun main(){

    val input = Scanner(System.`in`)

    val array = ArrayList<Int>()
    val array2 = ArrayList<Int>()
        for(j in 0 until 4){
            val n = input.nextInt()
            array.add(n)
        }
    for (i in 0 until 4){
        if(i == 0){
            val f = array[i+2]-array[i]
            array.add(f)
        }
        else if(i==1) {
            val s = array[i+2] - array[i]
            array.add(s)
        }
    }
    print(array.minOrNull())

    }
