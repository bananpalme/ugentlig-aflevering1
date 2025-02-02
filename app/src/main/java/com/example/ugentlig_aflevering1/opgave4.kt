package com.example.ugentlig_aflevering1

fun main() {
    val cpr = validCPR("2412023424")
    println(cpr)
}

fun validCPR(number:String):Boolean {
    if (number.length == 10 && number.substring(0,2).toInt() <= 31 && number.substring(2,4).toInt() <= 12 && number.substring(4,6).toInt() <= 12  ) {
        return true
    } else {
        return false
    }
}