package com.example.fizzbuzz

import kotlin.text.*

fun main() {
    for (x in 1..300) {
        var res = ""
        if (x % 3 == 0)
            res += "Fizz"
        if (x % 13 == 0) res += "Fezz"
        if (x % 11 == 0) {
            res = "Bong"
            if (x % 13 == 0) res = "Fezz$res"
            if (x % 17 == 0) res = reverse(res)
            println(res)
            continue
        }
        if (x % 5 == 0) res += "Buzz"
        if (x % 7 == 0) res += "Bang"
        if (x % 17 == 0) res = reverse(res)
        if (res == "") println(x)
        else println(res)
    }
}

fun reverse(a: String): String {
    var chunks: List<String> = a.chunked(4)
    chunks = chunks.reversed()
    val res = chunks.joinToString("")
    return res
}