package com.easy.kotlin
/**
 * Created by lovememo on 17-10-8.
 */
fun isEqualDemo() {
    val a = StringBuilder("123").toString()
    val b = StringBuilder("123").toString()

    println(a == b)
    println(a === b)
}