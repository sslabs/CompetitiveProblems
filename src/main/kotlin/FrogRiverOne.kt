class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        var leavesLeft = X
        val countA = IntArray(X) { 0 }

        for (i in A.indices) {
            if (A[i] - 1 < countA.size && countA[A[i] - 1] == 0) {
                leavesLeft--
                countA[A[i] - 1] = A[i]
            }
            if (leavesLeft == 0) {
                return i
            }
        }

        return -1
    }
}
