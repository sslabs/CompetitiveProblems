class Domino {

    fun solve(input: String): Int {
        val inputArray = input.split(",")
        var currentMax = 0
        var index = 0
        do {
            val result = countTilesStartingAt(inputArray, index)
            if (result.first > currentMax) currentMax = result.first
            index = result.second + 1
        } while (index < inputArray.size)

        return currentMax
    }

    fun countTilesStartingAt(input: List<String>, startingIndex: Int): Pair<Int, Int> {
        if (input.size == startingIndex + 1) return Pair(1, startingIndex)

        val firstRight = input[startingIndex].split("-")[1]
        val secondLeft = input[startingIndex + 1].split("-")[0]

        return if (firstRight == secondLeft)
            Pair(
                countTilesStartingAt(input, startingIndex + 1).first + 1,
                startingIndex
            )
        else
            Pair(1, startingIndex)
    }
}
