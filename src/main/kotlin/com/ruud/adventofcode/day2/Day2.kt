package com.ruud.adventofcode.day2

private const val DRAW = 3
private const val WIN = 6
private const val LOSE = 0
private const val ROCK = 1
private const val PAPER = 2
private const val SCISSOR  = 3

class Day2 {

    val scoring1 = mapOf(
        Pair("A X", DRAW + ROCK),
        Pair("A Y", WIN + PAPER),
        Pair("A Z", LOSE + SCISSOR),

        Pair("B X", LOSE + ROCK),
        Pair("B Y", DRAW + PAPER),
        Pair("B Z", WIN + SCISSOR),

        Pair("C X", WIN + ROCK),
        Pair("C Y", LOSE + PAPER),
        Pair("C Z", DRAW + SCISSOR),
    )

    val scoring2 = mapOf(
        Pair("A X", LOSE + SCISSOR),
        Pair("A Y", DRAW + ROCK),
        Pair("A Z", WIN + PAPER),

        Pair("B X", LOSE + ROCK),
        Pair("B Y", DRAW + PAPER),
        Pair("B Z", WIN + SCISSOR),

        Pair("C X", LOSE + PAPER),
        Pair("C Y", DRAW + SCISSOR),
        Pair("C Z", WIN + ROCK),
    )

    fun calculate1(input: List<String>): Int {
        return input.sumOf { scoring1[it] ?: 0 }

    }

    fun calculate2(input: List<String>): Int {
        return input.sumOf { scoring2[it] ?: 0 }
    }

}

fun main() {
    val input = Thread.currentThread().contextClassLoader.getResourceAsStream("input/day2/input.txt")!!.bufferedReader().readLines()

    val res1 = Day2().calculate1(input)
    println("Question 1 = $res1")

    val res2 = Day2().calculate2(input)
    println("Question 2 = $res2")
}

