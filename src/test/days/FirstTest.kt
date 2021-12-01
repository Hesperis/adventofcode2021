package days

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FirstTest {
    @Test
    fun `Given test input returns the correct number of increases`() {
        val result = First().one(testInput1)
        Assertions.assertEquals(7, result)
    }

    @Test
    fun `Given test input returns the correct number of triple increases`() {
        val result = First().two(testInput1)
        Assertions.assertEquals(5, result)
    }
}

val testInput1: ArrayList<Int> = arrayListOf(199,200,208,210,200,207,240,269,260,263)