/**
 * Long Number
 *
 *  Taken from https://kotlinlang.org/docs/competitive-programming.html#simple-example-reachable-numbers-problem
 */
class ReachableNumbers {

    tailrec fun removeTrailingZeros(x: Int): Int =
        if (x % 10 == 0) removeTrailingZeros(x / 10)
        else x

    fun f(x: Int) = removeTrailingZeros(x + 1)

    fun count(value: Int): Int {
        var initial = value;
        val reached = HashSet<Int>()
        while (reached.add(initial)) initial = f(initial)
        return reached.size
    }
}
