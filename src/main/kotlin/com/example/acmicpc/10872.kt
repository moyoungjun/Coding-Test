package com.example.acmicpc

import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    var su=1
    for(i in n downTo 1){
        su = su*i
    }
    println(su)


}