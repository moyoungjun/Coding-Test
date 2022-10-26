package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var boo = true
    while(boo) {
        val st = StringTokenizer(readLine())
            var a = Integer.parseInt(st.nextToken())
            var b = Integer.parseInt(st.nextToken())
            var c = Integer.parseInt(st.nextToken())

            if(a>b && a>c){
                if(a*a == b*b + c*c){
                    println("right")
                }
                else{
                    println("wrong")
                }
            }
            else if(b>c && b>a){
                if(b*b == a*a + c*c){
                    println("right")
                }
                else{
                    println("wrong")
                }

            }
            else if(c>a && c>b){
                if(c*c == a*a + b*b){
                    println("right")
                }
                else{
                    println("wrong")
                }

            }
            else if(a==0 || b==0 || c==0){
                boo=false
            }
            else{
                println("wrong")
            }
        }

}