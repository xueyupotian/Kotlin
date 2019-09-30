package com.example.mi.kotlin

fun main(args: Array<String>) {
    vars(1,2,3,4,5)
}

fun vars(vararg v: Int){
    for (vt in v){
        print(vt)
    }
}