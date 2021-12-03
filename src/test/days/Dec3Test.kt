package days

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Dec3Test {

    @Test
    fun `Correctly finds gamma and epsilon rate`() {
        val result = Dec3().one(testInput)
        assertEquals(198, result)
    }

    @Test
    fun `Correctly finds scrubber and oxygen rates`() {
        val result = Dec3().two(testInput)
        assertEquals(230, result)
    }
}

private val testInput = listOf<String>(
    "00100",
    "11110",
    "10110",
    "10111",
    "10101",
    "01111",
    "00111",
    "11100",
    "10000",
    "11001",
    "00010",
    "01010")