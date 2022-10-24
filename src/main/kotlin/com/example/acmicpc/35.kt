package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader


fun addDigits(num: Int): Int {
    var num2 = num
    var sum = 0
    while(num2 > 0) {

        sum = sum + (num2 % 10)
        num2 = num2 / 10
       if(sum > 9 && num2 == 0){
           num2 = sum
           sum = 0
       }
    }



    return sum

}
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    print(addDigits(n))


}