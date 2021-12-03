package days

class Dec3 {
    fun one(input: List<String>): Int {
        val bitList = getPairedBitList(input)
        val gamma = bitList.map { pair ->
            if (pair.first > pair.second) 0 else 1
        }.joinToString("")
        val epsilon = bitList.map { pair ->
            if (pair.first < pair.second) 0 else 1
        }.joinToString("")
        return Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2)
    }

    fun two(input: List<String>): Int {
        val oxygen = findRecCandidate(input, '1', '0', 0)
        val co2 = findRecCandidate(input, '0', '1', 0)
        return Integer.parseInt(oxygen, 2) * Integer.parseInt(co2, 2)
    }

    private fun findRecCandidate(input: List<String>, desired: Char, nonDesired: Char, position: Int): String {
        return if (input.size == 1) input[0] else {
            var candidates = input
            val bitList = getPairedBitList(candidates)
            candidates = if (bitList[position].first > bitList[position].second) {
                candidates.filter { it.toCharArray()[position] == desired }
            } else {
                candidates.filter { it.toCharArray()[position] == nonDesired }
            }
            findRecCandidate(candidates, desired, nonDesired, position.inc())
        }
    }

    // Creates a list of pairs with counts of 1 and 0 at matching positions
    private fun getPairedBitList(input: List<String>): List<Pair<Int, Int>> {
        val zeroBitList = createCorrectlySizedList(input[0])
        val oneBitList = createCorrectlySizedList(input[0])
        input.forEach { it.toCharArray()
            .forEachIndexed { position, char ->
                when (char.digitToInt()) {
                    0 -> zeroBitList[position] = zeroBitList[position].inc()
                    1 -> oneBitList[position] = oneBitList[position].inc()
                }
            }
        }
        return zeroBitList.zip(oneBitList)
    }

    //Convenience function to ensure that the lists are created equal
    private fun createCorrectlySizedList(template: String) : ArrayList<Int> {
        val list: ArrayList<Int> = arrayListOf()
        repeat(template.toCharArray().count()) { list.add(0) }
        return list
    }
}