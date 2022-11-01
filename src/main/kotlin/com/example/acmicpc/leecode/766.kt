package com.example.acmicpc.leecode

fun main() {
    val matrix = arrayOf(arrayOf(57,54), arrayOf(84,57))
    for(i in matrix){
        println(i.contentToString())
    }
    var answer = false
    println(matrix[0].size)
    if(matrix[0].size == 1 || matrix.size==1){
        answer = true
    }
    for(i in 0 until matrix.size-1){
        for(j in 0 until matrix[i].size -1){
            if((matrix[i][j] == matrix[i+1][j+1] && matrix.size >2)){
                answer = true
                print("t1")
            }
            else if(matrix[i][j] == matrix[i+1][j+1] && matrix.size==2){
                answer = true && answer
            }
            else if ((matrix[i][j] != matrix[i+1][j+1] )&& matrix[i].size > 1 ){
                answer = false && answer
            }
        }
    }
    println(answer)

}