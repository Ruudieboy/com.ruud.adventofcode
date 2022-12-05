package com.ruud.adventofcode.day1

import org.junit.Test
import kotlin.test.assertEquals

internal class Day1Test {

    @Test
    fun calculate() {
        val input = listOf(
            "1000",
            "2000",
            "3000",
            "",
            "4000",
            "",
            "5000",
            "6000",
            "",
            "7000",
            "8000",
            "9000",
            "",
            "10000",
        )
        assertEquals(24000, Day1().calculate(input,1))
    }
}
