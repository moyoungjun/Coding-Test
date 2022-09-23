package com.example.acmicpc

import java.util.*

fun main(){
    val input = Scanner(System.`in`)


    while(true){
        val n = input.next()
        if(n == "0"){
            break
        }


        if(n == n.reversed()){println("yes")}else{println("no")}

    }


}