package com.example.ugentlig_aflevering1

fun main() {
    val name: String = "Lukas Torben Lind Julius Kansakar"

    val splitName = name.split(" ")

    val firstname = splitName[0].substring(0,1)

    val lastname = splitName[splitName.size - 1]

    var string = ""

    for (i in 1 until splitName.size - 1) {
        string += "${(splitName[i].substring(0,1))}. "
    }



    println("$firstname. $string$lastname")
}

