package com.example.acmicpc.practice

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()
    val array = Array<Int>(26) { 0 }
    for(i in n ){
        array[i.code-97]++
    }
    for(i in array.indices){
        print("${array[i]} ")
    }
}