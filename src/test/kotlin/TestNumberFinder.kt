import org.junit.Test
import kotlin.test.assertEquals

class TestNumberFinder {

    @Test
    fun testSumOfEvens() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(1, 2, 3, 4)
        val sum = numberFinder.sumFirstNaturals(4)
        assertEquals(10, sum)
    }

    @Test
    fun testSumOfOdds() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        val sum = numberFinder.sumFirstNaturals(5)
        assertEquals(15, sum)
    }

    @Test
    fun testMaxNumberFourMissingOne() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(2, 3, 4)
        val missing = numberFinder.find(numbers)
        assertEquals(1, missing)
    }

    @Test
    fun testMaxNumberFourMissingFour() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(1, 2, 3)
        val missing = numberFinder.find(numbers)
        assertEquals(4, missing)
    }

    @Test
    fun testMaxNumberEightMissingFive() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(1, 2, 4, 6, 3, 7, 8)
        val missing = numberFinder.find(numbers)
        assertEquals(5, missing)
    }

    @Test
    fun testMaxNumberFiveMissingFour() {
        val numberFinder = NumberFinder()
        val numbers = intArrayOf(1, 2, 3, 5)
        val missing = numberFinder.find(numbers)
        assertEquals(4, missing)
    }
}