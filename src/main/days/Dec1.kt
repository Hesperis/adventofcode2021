package days

class First {
    fun one(input: List<Int>): Int {
        val pairedMeasurements = mutableListOf<Pair<Int,Int>>()
        for (i in 1 until input.size) {
            pairedMeasurements.add((input[i-1] to input[i]))
        }

        return pairedMeasurements.filter {
            it.second > it.first
        }.size
    }

    fun two(input: List<Int>) : Int {
        val tripleSumMeasurements = mutableListOf<Int>()
        for (i in 2 until input.size) {
            tripleSumMeasurements.add(input[i-2] + input[i-1] + input[i])
        }
        return one(tripleSumMeasurements)
    }
}
