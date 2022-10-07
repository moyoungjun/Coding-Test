package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {

    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = b-a
    val d = c+b
    println(d)
}