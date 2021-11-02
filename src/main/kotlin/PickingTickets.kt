class PickingTickets {
    fun solve(input: Array<Int>): Int {
        val sortedInput = input.toIntArray()
        sortedInput.sort()
        var longestSize = 0

        sortedInput.forEachIndexed { i, _ ->
            val size = unbrokenSize(sortedInput, i)
            longestSize = maxOf(size, longestSize)
        }

        return longestSize
    }

    fun unbrokenSize(sequence: IntArray, start: Int): Int {
        if (sequence.size == 1) return 1
        var sequenceSize = 1
        for (i in (start + 1).until(sequence.size)) {
            if (sequence[i - 1] == sequence[i] || sequence[i - 1] + 1 == sequence[i]) {
                sequenceSize++
            } else {
                break
            }
        }
        return sequenceSize
    }
}
