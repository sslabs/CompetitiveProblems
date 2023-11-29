class MaximizeValue {
    fun solve(input: Array<Int>): Array<Int> {
        val list = input.toList().sorted().toMutableList()
        val size = list.size

        if (size < 3) return list.toTypedArray()

        if (size in 3..5) {
            val first = list.removeAt(0)
            list.add(2, first)
        }

        if (size > 5) {
            val first = list.removeAt(0)
            val second = list.removeAt(0)
            list.add(2, first)
            if (size % 2 == 0) {
                list.add(size - 2, second)
            } else {
                list.add(size - 1, second)
            }
        }

        return list.toTypedArray()
    }
}
