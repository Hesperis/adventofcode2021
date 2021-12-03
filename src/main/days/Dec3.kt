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
        val oxygen = findCandidate(input, '1', '0')
        val co2 = findCandidate(input, desired = '0', '1')
        return Integer.parseInt(oxygen, 2) * Integer.parseInt(co2, 2)
    }

    private fun findCandidate(input: List<String>, desired: Char, nonDesired: Char): String {
        var candidates = input
        var position = 0
        while (candidates.size > 1) {
            val bitList = getPairedBitList(candidates)
            candidates = if (bitList[position].first > bitList[position].second) {
                candidates.filter { it.toCharArray()[position] == desired }
            } else {
                candidates.filter { it.toCharArray()[position] == nonDesired }
            }
            position = position.inc()
        }
        return candidates[0]
    }


    private fun getPairedBitList(input: List<String>): List<Pair<Int, Int>> {
        val zeroBitList = createCorrectlySizedList(input[0])
        val oneBitList = createCorrectlySizedList(input[0])
        for (s in input) {
            s.toCharArray().forEachIndexed { position, char ->
                when(char.digitToInt()) {
                    0 -> handleBitList(zeroBitList, position)
                    1 -> handleBitList(oneBitList, position)
                }
            }
        }
        return zeroBitList.zip(oneBitList)
    }

    private fun createCorrectlySizedList(template: String) : ArrayList<Int> {
        val list: ArrayList<Int> = arrayListOf()
        for (c in template.toCharArray()) {
            list.add(0)
        }
        return list
    }

    private fun handleBitList(bitList: ArrayList<Int>, position: Int) {
        bitList[position] = bitList[position].inc()
    }
}