package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
        val s = br.readLine()
        println("${s::class.simpleName}")
        val d = br.readLine().toInt()
        println("${d::class.simpleName}")
}