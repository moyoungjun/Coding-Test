package com.example.acmicpc

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val str = n.toString().length
    val start = n - (str*9)
    var re = 0
    for(i in start..n){
        var sum = 0
        var k = i
        while(k>0){
            sum = sum + k%10
            k = k/10
        }
        if(sum == n){
            re = i
            break
        }
    }

    print(re)
}