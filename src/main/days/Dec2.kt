package days

class Dec2 {
    fun one(input: List<String>): Int {
        var horizontalPosition: Int = 0
        var depth: Int = 0
        input.forEach { command ->
            val commandPair = command.splitToPair()
            when(commandPair.first) {
                "forward" -> horizontalPosition = horizontalPosition.plus(commandPair.second)
                "down" -> depth = depth.plus(commandPair.second)
                "up" -> depth = depth.minus(commandPair.second)
                else -> {
                    print("Something is not right, command given was ${commandPair.first}")
                }
            }
        }
        return horizontalPosition*depth
    }

    fun two(input: List<String>): Int {
        var horizontalPosition: Int = 0
        var depth: Int = 0
        var aim: Int = 0
        input.forEach { command ->
            val commandPair = command.splitToPair()
            when(commandPair.first) {
                "forward" ->  {
                    horizontalPosition = horizontalPosition.plus(commandPair.second)
                    depth = depth.plus(aim*commandPair.second)
                }
                "down" -> aim = aim.plus(commandPair.second)
                "up" -> aim = aim.minus(commandPair.second)
                else -> {
                    print("Something is not right, command given was ${commandPair.first}")
                }
            }
        }
        return horizontalPosition*depth
    }
}

private fun String.splitToPair(): Pair<String, Int> {
    val stringList = this.split(' ')
    return Pair(stringList[0], stringList[1].toInt())
}