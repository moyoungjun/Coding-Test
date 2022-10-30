package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val tre = IntArray(45) { i -> i * (i + 1) / 2 }
    for(i in 1 .. n ){
        val s = br.readLine().toInt()
        if(triangle(s,tre)){
            println(1)
        }
        else {
            println(0)
        }
    }

}

fun triangle(n: Int,tre: IntArray): Boolean{
    var answer = false
    for(i in 1..44){
        for(j in 1..44){
            for(s in 1 .. 44){
                if(n == tre[i]+tre[j]+tre[s]){
                    answer = true
                }
            }

        }
    }
    return answer
}