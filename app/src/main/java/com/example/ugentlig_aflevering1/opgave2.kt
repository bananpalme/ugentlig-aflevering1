package com.example.ugentlig_aflevering1

fun main() {
    val max: Int = getMax(1,18,8)

    val min: Int = getMin(1, 18, -8)

    println(max)
    println(min)
    // For loop ville være meget nemmere, men nu har jeg lavet dette
}

fun getMax(a:Int,b:Int,c:Int): Int {
    if (a > b && a > c) {
        return a
    } else if (b > a && b > c) {
        return b
    } else {
        return c
    }
}

fun getMin(a:Int,b:Int,c:Int): Int {
    if (a < b && a < c) {
        return a
    } else if (b < a && b < c) {
        return b
    } else {
        return c
    }

}