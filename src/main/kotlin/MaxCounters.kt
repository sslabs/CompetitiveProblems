class MaxCounters {
    fun solution(N: Int, A: IntArray): IntArray {
        var counter = IntArray(N)
        var maxCounter = 0

        for (i in A.indices) {
            if (A[i] <= N) {
                counter[A[i] - 1]++
                if (counter[A[i] - 1] > maxCounter) maxCounter = counter[A[i] - 1]
            } else {
                counter = IntArray(N) { maxCounter }
            }
        }

        return counter
    }
}
