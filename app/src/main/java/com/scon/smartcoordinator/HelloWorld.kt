package com.scon.smartcoordinator

fun main(){
    val arr1 = listOf("1", "2")
    var arr2 = mutableListOf("1", "2")

    for(item in arr1){
        println(item)
    }
    for((index, item) in arr1.withIndex()){
        println("$index, $item")
    }

    val hello: Any = "hello"

    if(hello is String){
        var str: String = hello
    }
}