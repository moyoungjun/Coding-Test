package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toLong()
    println(n.toString().toCharArray().reversed().map(Character::getNumericValue).toIntArray())
}
fun soulution(n: Long): IntArray {
    var answer = intArrayOf()

    n.toString().map {
        answer += (it.code - '0'.code)
    }

    return answer.reversedArray()
}

