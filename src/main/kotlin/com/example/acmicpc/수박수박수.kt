package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n =readLine().toInt()
    var s = ""
    for(i in 1 ..n){
        if(i%2 == 1) {
            s = s+"수"
        }
        else {
           s = s+"박"
        }
    }
    print(s)

}