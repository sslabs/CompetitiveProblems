import java.lang.Math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        val sum = A.sum()

        var left = A[0]
        var right = sum - A[0]
        var min = abs(right - left)
        for (i in 1 until A.size) {
            left += A[i]
            right -= A[i]
            val diff = abs(right - left)
            if (diff < min) min = diff
        }

        return min
    }
}
