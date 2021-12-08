import java.lang.Math.ceil

class OddOccurrencesInArray {
    fun solution(A: IntArray): Int {
        val map = HashMap<Int, Int>()

        for (a in A) {
            if (map.containsKey(a)) {
                if (map[a]!! > 0) {
                    map[a] = (-1 * map[a]!!) - a
                } else {
                    map[a] = (-1 * map[a]!!) + a
                }
            } else {
                map[a] = a
            }
        }
        val a = 75
        val b = 30
        val c = kotlin.math.ceil((a - 10 / b).toDouble())

        return map.filter { (key, value) -> value > 0 }.keys.first()
    }
}
