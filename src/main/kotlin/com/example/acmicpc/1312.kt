package com.example.acmicpc

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.nextInt()
    var result = a%b
    for(i in 0 until n-1 ) {
        result = result*10
        result = result%b
    }
    result = result*10
    print(result/b)
}