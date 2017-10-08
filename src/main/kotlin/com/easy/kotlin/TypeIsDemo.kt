package com.easy.kotlin

/**
 * Created by lovememo on 17-10-8.
 */

fun getLength(obj: Any): Int? {
    var result = 0
    if(obj is String) {//类型检测
        //自动转为string
        println(obj::class)
        result = obj.length
        println(result)
    }
    //恢复obj
    println(obj::class)
    return result
}
