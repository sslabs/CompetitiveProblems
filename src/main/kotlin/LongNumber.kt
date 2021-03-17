/**
 * Long Number
 *
 *  Taken from https://kotlinlang.org/docs/competitive-programming.html#functional-operators-example-long-number-problem
 */
class LongNumber {
    fun replace(num: String, digitsMapping: List<Int>): String {
        fun translate(c: Char) = '0' + digitsMapping[c - '1']
        val i = num.indexOfFirst { c -> translate(c) > c }
            .takeIf { it >= 0 } ?: num.length
        val j = num.withIndex().indexOfFirst { (j, c) -> j > i && translate(c) < c }
            .takeIf { it >= 0 } ?: num.length
        return num.substring(0, i) +
                num.substring(i, j).map { c -> translate(c, digitsMapping) }.joinToString("") +
                num.substring(j)
    }

    fun translate(digit: Char, mapping: List<Int>) = '0' + mapping[digit - '1']
}
