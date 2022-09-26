package com.example.acmicpc

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val item = arrayListOf<Int>(1,1,2,2,2,8)

    for(i in 0 until 6){
        var n = input.nextInt()
        if(n in 0..10){
            if(item[i] > n){
            print("${item[i]-n} ")

        }
        else if(item[i] < n){
            print("-${n-item[i]} ")
        }
        else{
            print("0 ")
        }
        }
        else {break}
    }

}