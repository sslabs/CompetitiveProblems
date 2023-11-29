import java.lang.RuntimeException

/*
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos
 *
 * It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
 * Each person wears a sticker indicating their initial position in the queue from 1 to n.
 * Any person can bribe the person directly in front of them to swap positions,
 *  but they still wear their original sticker. One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order.
 *  Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 * Example
 *
 * q = [1, 2, 3, 5, 4, 6, 7, 8]
 * If person  bribes person , the queue will look like this: . Only  bribe is required. Print 1.
 *
 * q = [4, 1, 2, 3]
 * Person  had to bribe  people to get to the current position. Print Too chaotic.
 */
class NewYearChaos {
    fun minimumBribes(q: Array<Int>): Unit {
        // Write your code here
        try {
            calculateMinimumBribes(q).takeIf { it >= 0 }
                ?.apply { println(this) }
        } catch (e: RuntimeException) {
            println("Too chaotic")
        }
    }

    fun calculateMinimumBribes(q: Array<Int>, lastIndex: Int = q.size - 1): Int {
        // Base cases
        if (lastIndex < 0) {
            return 0
        }

        val element = lastIndex + 1
        if (q[lastIndex] == element) {
            return calculateMinimumBribes(q, lastIndex - 1)
        }

        // Recursive step
        val bribes = when {
            lastIndex - 1 >= 0 && q[lastIndex - 1] == element -> {
                swapRight(q, lastIndex - 1, 1)
                1
            }
            lastIndex - 2 >= 0 && q[lastIndex - 2] == element -> {
                swapRight(q, lastIndex - 2, 2)
                2
            }
            else -> throw RuntimeException()
        }
        return bribes + calculateMinimumBribes(q, lastIndex - 1)
    }

    private fun swapRight(q: Array<Int>, index: Int, jumps: Int) {
        for (i in index until index + jumps) {
            val element = q[i]
            q[i] = q[i + 1]
            q[i + 1] = element
        }
    }
}
