package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val st2 = StringTokenizer(readLine())
    val st3 = StringTokenizer(readLine())
    var sum = 0
    while(st.hasMoreTokens()){
        val a = Integer.parseInt(st.nextToken())
        sum = a + sum
    }
    when(sum) {
        1 -> println("C")
        2 -> println("B")
        3 -> println("A")
        4 -> println("E")
        0 -> println("D")
    }
    sum = 0

    while(st2.hasMoreTokens()){
        val a = Integer.parseInt(st2.nextToken())
        sum = a + sum
    }
    when(sum) {
        1 -> println("C")
        2 -> println("B")
        3 -> println("A")
        4 -> println("E")
        0 -> println("D")
    }
   sum = 0
    while(st3.hasMoreTokens()){
        val a = Integer.parseInt(st3.nextToken())
        sum = a + sum
    }
    when(sum) {
        1 -> println("C")
        2 -> println("B")
        3 -> println("A")
        4 -> println("E")
        0 -> println("D")
    }






}