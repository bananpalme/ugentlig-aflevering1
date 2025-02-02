package com.example.ugentlig_aflevering1

fun main() {
    val numbers: List<Int> = listOf(1,2,5,10,17)

    println(calculateAverage(numbers))

}

fun calculateAverage(list: List<Int>):Double {
    return list.average()
}