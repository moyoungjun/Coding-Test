package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun isPowerOfTwo(n: Int): Boolean {
    var bool = false
    if(n>1){
        isPowerOfTwo(n/2)
    }
    var sum = 0
    sum = sum + n%2
    if(sum==1){
        bool = true
    }
    println(sum)
    return bool
}

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()

    print(isPowerOfTwo(n))

}
