package com.example.ugentlig_aflevering1

fun main() {
    val words: List<String> = listOf("Banana", "Chair", "Fountain", "archipelago", "Duck")
    val result = filterWordsByLength(words, 6)
    println(result)
}

fun filterWordsByLength(list: List<String>, length: Int):List<String> {
    val filteredList = list.filter { it.length > length }
    return filteredList
}