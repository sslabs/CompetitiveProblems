/*
You are given an array of prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples:
Input: prices = [7,1,5,3,6,4]
Output: 5

Input: prices = [7,6,4,3,1]
Output: 0
 */
class MaxPrice {
    fun solve(input: Array<Int>): Int {
        if (input.isEmpty()) {
            return 0
        }

        return findMaxInFuture(input).second
    }

    /**
     * Return a pair with the index fo the max price in the future, and also
     * the max profit.
     *
     * Solution O(n)
     */
    private fun findMaxInFuture(input: Array<Int>, start: Int = 0): Pair<Int, Int> {
        if (start + 1 == input.size) {
            return Pair(start, 0)
        }

        var maxIndex = start
        var maxProfit = 0

        for (i in start + 1 until input.size) {
            if (input[i] < input[i - 1]) {
                val future = findMaxInFuture(input, i)
                if (input[future.first] > input[maxIndex]) {
                    maxIndex = future.first
                }
                if (future.second > maxProfit) {
                    maxProfit = future.second
                }
                if (input[maxIndex] - input[start] > maxProfit) {
                    maxProfit = input[maxIndex] - input[start]
                }
                break
            }
            if (input[i] > input[maxIndex]) {
                maxIndex = i
                maxProfit = input[i] - input[start]
            }
        }

        return Pair(maxIndex, maxProfit)
    }

    /**
     * Solution O(n^2)
     *
     */
    fun solve2(input: Array<Int>): Int {
        // Base case
        if (input.size == 1) {
            return 0
        }

        var maxProfit = 0
        input.forEachIndexed { index, i ->
            val rest = input.drop(index + 1)
            val maxInRest = rest.maxOrNull() ?: 0
            if (maxInRest - i > maxProfit) maxProfit = maxInRest - i
        }
        return maxProfit
    }
}
