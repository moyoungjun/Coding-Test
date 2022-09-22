package com.example.acmicpc


import java.util.*



fun main(){
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val array = ArrayList<Int>()
    for(i in 0 until n){
        val x = input.nextInt()
        array.add(x)
    }
    array.sorted().forEach{println("hi $it")}
    var tmp = 0
    for(j in 0 until array.size-1) {
        for (i in 0 until array.size - 1) {
            if (array[i] > array[i + 1]) {
                tmp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = tmp
            }
        }
    }

    array.forEach { println(it) }

}