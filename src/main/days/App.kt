package days

import java.io.File

fun main(args : Array<String>) {
    // Day 1
    val inputOne: List<Int> = File("input/dec1/dec1input.txt").convertFileToArrayList() as List<Int>
    println("Day 1!")
    println("The first assignment: " + Dec1().one(inputOne))
    println("The second assignment: " + Dec1().two(inputOne))

    // Day 2
    val inputTwo: List<String> = File("input/dec2/dec2input.txt").convertFileToArrayList() as List<String>
    println("Day 2!")
    println("The first assignment: " + Dec2().one(inputTwo))
    println("The second assignment: " + Dec2().two(inputTwo))
}

fun File.convertFileToArrayList (): List<Any> {
    val list = this.readLines()
    return if (list[1].toIntOrNull() != null) {
        list.map { it.toInt() }
    } else list
}