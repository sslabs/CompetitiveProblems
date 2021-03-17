/**
 * Napoleon Cake
 *
 * Problem statement: https://codeforces.com/contest/1501/problem/B
 */
class NapoleonCake {
    fun drenched(creams: List<Int>): IntArray {
        val result = IntArray(creams.size)
        var rest = 0
        for (i in creams.size - 1 downTo 0) {
            result[i] = if (creams[i] > 0 || rest > 0) 1 else 0
            rest = maxOf(creams[i] -1, rest - 1)
        }
        return result
    }
}
