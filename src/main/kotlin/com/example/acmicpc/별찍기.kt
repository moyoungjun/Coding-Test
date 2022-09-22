package com.example.acmicpc

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    for (i in 0 until n){
        for(j in 1..n){
            if(j <= n-i-1){
                print(" ")
            }
            else{
                print("*")
            }
        }
        println()
    }

}