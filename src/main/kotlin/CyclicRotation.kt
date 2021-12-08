class CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        if (A.isEmpty() || K == 0) return A

        val n : Int = K % A.size
        val T = mutableListOf<Int>()
        for (i in (A.size - 1) downTo 0) {
            if (i > A.size - 1 - n) {
                T.add(T.size, A[i])
            } else {
                A[i + n] = A[i]
            }
        }
        for (i in 0 until n) {
            A[i] = T.removeAt(T.size - 1)
        }

        return A
    }
}
