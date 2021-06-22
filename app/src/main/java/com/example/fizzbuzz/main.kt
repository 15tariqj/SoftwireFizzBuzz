package com.example.fizzbuzz

import kotlin.text.*

fun main() {
    print("Please enter the maximum number that outputs should be printed to: ")
    val y = readLine()!!.toInt()
    print("Please enter the numbers for the rules you wish to enable, seperated by commas: ")
    var z = readLine()!!
    var zInts = (z.split(",").toTypedArray()).map { it.toInt() }.toTypedArray()
    println(zInts[2])
    for (x in 1..y) {
        var res = ""
        if (x % 3 == 0 && zInts.contains(3))
            res += "Fizz"
        if (x % 13 == 0 && zInts.contains(13)) res += "Fezz"
        if (x % 11 == 0 && zInts.contains(11)) {
            res = "Bong"
            if (x % 13 == 0 && zInts.contains(13)) res = "Fezz$res"
            if (x % 17 == 0 && zInts.contains(17)) res = reverse(res)
            println(res)
            continue
        }
        if (x % 5 == 0 && zInts.contains(5)) res += "Buzz"
        if (x % 7 == 0 && zInts.contains(7)) res += "Bang"
        if (x % 17 == 0 && zInts.contains(17)) res = reverse(res)
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