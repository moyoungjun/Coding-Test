package com.example.acmicpc

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = n.toString()
    var answer = true
    var results = 0
    for(i in 0 until s.length){
        val f = s.substring(i,i+1)
        results = f.toInt() + results
    }
    for(i in s){
        println(Integer.parseInt(i.toString()))
    }
    if(n % results !=0){
        answer = false
    }
    println(answer)
}