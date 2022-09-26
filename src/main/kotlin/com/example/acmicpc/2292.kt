package com.example.acmicpc

import java.util.*


fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var room = 1
    var s =1
    if(n==1){println(1)}
    else {
        while (room < n ){
            room = room + s*6
            s++
        }
        println(s)
    }
}