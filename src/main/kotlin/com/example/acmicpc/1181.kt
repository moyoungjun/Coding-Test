package com.example.acmicpc

import java.util.*

fun main(){

    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val array = mutableSetOf<String>()
    repeat(n){
        array.add(input.next())
    }
    val list = array.sortedWith(Comparator<String> { a, b ->
        if (a.length > b.length) 1
        else if (a.length < b.length) -1
        else a.compareTo(b)
    })
    list.forEach { println(it) }

}