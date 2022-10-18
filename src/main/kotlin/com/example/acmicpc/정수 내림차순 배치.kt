package com.example.acmicpc


import java.io.BufferedReader
import java.io.InputStreamReader


fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var n = readLine().toLong()
    //풀이 1
    println(n.toString().toList().sortedDescending()
        .let { list->var temp = ""
        list.forEach { char->temp +=  char }
        temp
        })
    //풀이 2
    println(n.toString().toMutableList().sortedDescending().joinToString("","",""))

    var a:Long = 1234
    var result:Long = 0
    while(a.toInt() != 0){
        result = result*10
        result = (result + a%10)
        a = a/10
    }
    println(result)
}