class PermMissingElem {
    fun solution(A: IntArray): Int {
        if (A.isEmpty()) return 1

        val N = A.size + 1
        val expectedSum = (N * (1 + N)) / 2
        val actualSum = A.sum()

        return expectedSum - actualSum
    }

}
