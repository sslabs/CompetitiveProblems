import org.junit.Test
import kotlin.test.assertEquals

/**
 * New Year and Hurry
 *
 * Problem from https://codeforces.com/problemset/problem/750/A
 */
class TestNewYearAndHurry {

    @Test
    fun `All time spent with problems and it is enough time to complete them all`() {
        val problemsCount = 5
        val timeToArrive = 1
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(5, result)
    }

    @Test
    fun `All time spent with problems and it is not enough time to complete them all`() {
        val problemsCount = 50
        val timeToArrive = 1
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(9, result)
    }

    @Test
    fun `There is no time so solve any problem`() {
        val problemsCount = 1
        val timeToArrive = 236
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(0, result)
    }

    @Test
    fun `There is no time so solve only one problem`() {
        val problemsCount = 12
        val timeToArrive = 235
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(1, result)
    }

    @Test
    fun `3 problems and 222 minutes to arrive`() {
        val problemsCount = 3
        val timeToArrive = 222
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(2, result)
    }

    @Test
    fun `4 problems and 190 minutes to arrive`() {
        val problemsCount = 4
        val timeToArrive = 190
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(4, result)
    }

    @Test
    fun `7 problems and 1 minutes to arrive`() {
        val problemsCount = 7
        val timeToArrive = 1
        val systemUnderTest = NewYearAndHurry()
        val result = systemUnderTest.solve(problemsCount, timeToArrive)
        assertEquals(7, result)
    }
}