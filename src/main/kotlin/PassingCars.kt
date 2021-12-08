class PassingCars {
    fun solution(A: IntArray): Int {
        var total = 0
        for (i in A.indices) {
            if (A[i] == 0) {
                total += countOccurrences(A, i + 1, 1)
            }
        }
        return total
    }

    fun countOccurrences(A: IntArray, start: Int, m: Int): Int {
        if (start >= A.size) return 0

        var c = 0
        for (i in start until A.size) {
            if (A[i] == m) c++
        }
        return c
    }
}
