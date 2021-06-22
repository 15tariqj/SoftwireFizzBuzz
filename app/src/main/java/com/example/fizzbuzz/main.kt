package com.example.fizzbuzz

import kotlin.text.*

fun main() {
    for (x in 1..100) {
        var res = ""
        if (x % 3 == 0)
            res += "Fizz"
        if (x % 5 == 0) res += "Buzz"
        if (x % 7 == 0) res += "Bang"
        if (x % 11 == 0) res = "Bong"
        if (res == "") println(x)
        else println(res)
    }
}