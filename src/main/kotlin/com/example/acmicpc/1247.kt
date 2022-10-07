package com.example.acmicpc


import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger


fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    repeat(3) {
        var s = BigInteger.ZERO
        val n = Integer.parseInt(readLine())
        repeat(n){
            val big = readLine().toBigInteger()
            s = s.add(big)
        }
        println(
            when {
                s < BigInteger.ZERO -> "-"
                s > BigInteger.ZERO -> "+"
                else ->"0"
            }
        )
    }
}