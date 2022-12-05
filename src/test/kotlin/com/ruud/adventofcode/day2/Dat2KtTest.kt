package com.ruud.adventofcode.day2

import org.junit.Test
import kotlin.test.assertEquals

class Dat2KtTest {

    @Test
    fun calculateDay2_1() {
        val res = Day2().calculate1(listOf("A Y", "B X", "C Z"))
        assertEquals(15, res)
    }

    @Test
    fun calculateDay2_2() {
        val res = Day2().calculate2(listOf("A Y", "B X", "C Z"))
        assertEquals(12, res)
    }
}
