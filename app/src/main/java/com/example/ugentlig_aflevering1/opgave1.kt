package com.example.ugentlig_aflevering1

fun main() {
    println("Enter your age: ")
    val input = readln().toInt()

    if (input >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are not eligible to vote")
    }

}