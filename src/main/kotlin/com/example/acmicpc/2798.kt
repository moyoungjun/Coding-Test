package com.example.acmicpc

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N: Int = nextInt()
    val M: Int = nextInt()
    val arr = IntArray(N)
    var result = 0

    for (i in 0 until N) {
        arr[i] = nextInt()
    }

    for (i in 0 until N - 2) {
        for (j in i + 1 until N - 1) {
            for (k in j + 1 until N) {
                val temp = arr[i] + arr[j] + arr[k]
                if (M == temp) {
                    result = temp
                }
                if (temp in (result + 1) until M) {
                    result = temp
                }
            }
        }
    }
    print(result)
}