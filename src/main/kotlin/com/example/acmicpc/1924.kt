package com.example.acmicpc

import java.time.LocalDate
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val d = LocalDate.of(2007,x,y)
    println(d.dayOfWeek.toString().substring(0,3))

}