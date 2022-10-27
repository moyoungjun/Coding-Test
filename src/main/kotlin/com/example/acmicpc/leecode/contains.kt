package com.example.acmicpc.leecode

import kotlin.math.abs


fun main() {
    var nums = arrayListOf<Int>(1,2,3,1,2,3)
    var k = 2
    var answer = false

    for(i in 0 until nums.size){
        for(j in 0 until nums.size){
            if((abs(i-j) <= k) && (nums[i]==nums[j]) && i!=j){
                answer = true
            }
        }
    }
    print(answer)

}