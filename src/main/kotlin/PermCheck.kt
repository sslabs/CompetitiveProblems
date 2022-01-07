class PermCheck {
    fun solution(A: IntArray): Int {
        val countArray = IntArray(A.size)

        for (i in A.indices) {
            if (A[i] > A.size) {
                return 0
            } else {
                countArray[A[i] - 1]++
            }
        }

        return if (countArray.any { it != 1 }) 0 else 1
    }
}
