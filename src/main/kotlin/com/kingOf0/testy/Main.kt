package com.kingOf0.testy

fun main() {

    val stack = FixedArrayList<Int>(5)
    stack.add(5)
    stack.add(3)
    stack.add(10)
    stack.add(20)
    stack.add(8)
    stack.add(5)
    stack.add(8)
    stack.add(1)
    stack.add(3)
    println(stack)
    for (i in stack) {
        println(i)
    }
    println(stack)

}



