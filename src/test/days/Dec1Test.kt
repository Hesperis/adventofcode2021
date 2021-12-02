package days

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Dec1Test {
    @Test
    fun `Given test input returns the correct number of increases`() {
        val result = Dec1().one(testInput)
        Assertions.assertEquals(7, result)
    }

    @Test
    fun `Given test input returns the correct number of triple increases`() {
        val result = Dec1().two(testInput)
        Assertions.assertEquals(5, result)
    }
}

private val testInput: ArrayList<Int> = arrayListOf(199,200,208,210,200,207,240,269,260,263)