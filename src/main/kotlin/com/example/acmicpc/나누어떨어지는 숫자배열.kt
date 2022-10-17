package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader


fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val arr = intArrayOf(1,2,6,4,5,3)
    var answer = arr.filter {it % n == 0}.sorted().toIntArray()
    if(answer.isEmpty()){
        intArrayOf(-1)
    }
}