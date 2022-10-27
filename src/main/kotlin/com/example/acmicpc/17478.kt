package com.example.acmicpc

import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){

    val n = readLine().toInt()
    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    regrettion(n)


}
fun regrettion(n: Int) {
    var str = "____"

    var num = n
    var answer ="\"재귀함수가 뭔가요?\""
     var b="\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
     var c="마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
     var d="그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
    var f = "라고 답변하였지."
    var z = "\"재귀함수는 자기 자신을 호출하는 함수라네\""
    while(num >= 0){
        println(answer)
        if(num >=1){
            println(b)
            println(c)
            println(d)
        }
        else if(num.equals(0)){
            println(z)
            println(f)
        }
        answer = str + answer
        b = str + b
        c = str + c
        d = str + d
        f = str + f
        z = str + z
        num--
    }
    while(num+1 < n){

        num++
        println(f)
    }
}