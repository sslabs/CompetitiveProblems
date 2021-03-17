/**
 * Watermelon
 *
 * Problem statement: https://codeforces.com/contest/4/problem/A
 */
class Watermelon {
    fun split(weight: Int): String {
        return when {
            weight != 2 && weight % 2 == 0 -> "YES"
            else -> "NO"
        }
    }
}
