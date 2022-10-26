package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    for(i in 0 until n){
        val st = StringTokenizer(readLine())
        while(st.hasMoreTokens()) {
            print("${st.nextToken().reversed()} ")
        }
    }
}