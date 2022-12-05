package com.ruud.adventofcode.day1

class Day1 {
    fun calculate(input: List<String>, amountOfElves: Int): Int {
        return input.fold(mutableListOf(0)) { acc, s ->
            when {
                s.isNotBlank() -> acc[acc.lastIndex] = s.toInt() + acc.last()
                else -> acc.add(0)
            }
            acc
        }
            .sortedDescending()
            .take(amountOfElves)
            .sum()
    }
}
fun main() {
    val input = Thread.currentThread().contextClassLoader.getResourceAsStream("input/day1/input.txt")!!.bufferedReader().readLines()

    val day1 = Day1()
    println(" Question 1 = ${day1.calculate(input, 1)}")
    println(" Question 2 = ${day1.calculate(input, 3)}")
}
