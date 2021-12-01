package days

import java.io.File

fun main(args : Array<String>) {
    // Day 1
    val inputOne: List<Int> = File("input/dec1/inputOne.txt").convertFileToArrayList() as List<Int>
    println("Day 1!")
    println("The first assignment: " + First().one(inputOne))
    println("The second assignment: " + First().two(inputOne))

}

fun File.convertFileToArrayList (): List<Any> {
    val list = this.readLines()
    return if (list[1].toIntOrNull() != null) {
        list.map { it.toInt() }
    } else list
}