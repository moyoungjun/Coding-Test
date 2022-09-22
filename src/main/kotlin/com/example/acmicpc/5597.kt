package com.example.acmicpc

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val input = Scanner(System.`in`)
    val limit = 10
    val min = 1

    val array = Array(10){11}
    val array2 = Array<Int>(10) { i -> i }


    for(i in 0 .. 7){
        val n = input.nextInt()
        if(n in min..limit){
            array[i] = n
        }
        else if(n >10){
            break
        }

    }



    for(i in array.indices){
        println(array[i])
    }
//    for(i in array.indices){
//        if(array[i]!=(array2[i]+1)){println(array2[i]+1)}
//    }

}


