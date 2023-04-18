object MissingInteger {
    fun solution(A: IntArray): Int {
        val counter = IntArray(1000000) { 0 }
        for (i in A.indices) {
            if (A[i] > 0) {
                counter[A[i] - 1]++
            }
        }

        counter.forEachIndexed { index, i ->
            if (i == 0) {
                return index + 1
            }
        }
        return 1 // First integer greater than 0
    }
}