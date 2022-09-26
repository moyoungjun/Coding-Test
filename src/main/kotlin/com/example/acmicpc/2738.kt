package com.example.acmicpc

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val array = ArrayList<Int>()
    val array2 = ArrayList<Int>()
    for(i in 0 until n){
        for(j in 0 until m){
            val a = sc.nextInt()
            array.add(a)
        }
    }
    for(i in 0 until n){
        for(j in 0 until m){
            val a = sc.nextInt()
            array2.add(a)
        }
    }
    for(i in 0 until n*n){

        print("${array[i] + array2[i]} ")
        if((i+1)%n == 0){
            println()
        }
    }


}