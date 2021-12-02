package days

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Dec2Test {
    @Test
    fun `testing that the multiplicator of horizontal position is right`() {
        val result = Dec2().one(testInput)
        Assertions.assertEquals(150, result)
    }

    @Test
    fun `testing that I can correctly handle aim`() {
        val result = Dec2().two(testInput)
        Assertions.assertEquals(900, result)
    }
}

private val testInput = listOf("forward 5",
        "down 5",
        "forward 8",
        "up 3",
        "down 8",
        "forward 2")