package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader


val array = IntArray(9)
val result = 45
var sum = 0
fun solution(numbers: IntArray): Int {
    var answer: Int = -1
    var filt = numbers.filter { it != 0 }
    filt = filt.sorted().distinct()
    for(i in 0 until filt.size){
        sum = filt[i]+sum
    }
    answer = result - sum
    return answer
}
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){

    val sp = readLine().split(",").map { it.toInt() }
    for(i in 0 until sp.size){
        array[i] = sp[i]
    }

    print(solution(array))

}