package com.example.acmicpc

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val array = ArrayList<Int>()
    if(n>=1 && m<=1000 ) {
        for (i in 1..m) {
            for (j in 1..i) {
                array.add(i)
            }
        }
        var sum = 0

        for (s in n-1 until m) {
            sum = array[s] + sum
        }
        print(sum)
    }
}
