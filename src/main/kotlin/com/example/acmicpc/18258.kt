package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val queue: Deque<Int> = LinkedList()
    val sb = StringBuffer()
    for(i in 1 .. n) {
        val st = StringTokenizer(readLine())
        val chars = st.nextToken()
        if(chars=="push"){
            queue.add(st.nextToken().toInt())
        }
        else if(chars == "pop"){
            if(queue.isNotEmpty()) {
                sb.append("${queue.pollFirst()}\n")
            }
            else {
                sb.append("-1\n")
            }
        }
        else if(chars == "front"){
            if(queue.isNotEmpty()){
                sb.append("${queue.first}\n")
            }
            else {
                sb.append("-1\n")
            }
        }
        else if(chars == "back"){
            if(queue.isNotEmpty()){
                sb.append("${queue.last}\n")
            }
            else {
                sb.append("-1\n")
            }
        }
        else if(chars == "size"){
            sb.append("${queue.size}\n")
        }
        else if(chars == "empty"){
            if(queue.isEmpty()){
                sb.append("1\n")
            }
            else {
                sb.append("0\n")
            }
        }
    }
    print(sb.toString())
}