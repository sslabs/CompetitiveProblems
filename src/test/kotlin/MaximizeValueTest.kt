import org.junit.Assert
import org.junit.Test

class MaximizeValueTest {

    @Test
    fun testOneElement() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(3).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(3), solution.toIntArray())
    }

    @Test
    fun testTwoElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(4, 3).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(3, 4), solution.toIntArray())
    }

    @Test
    fun testTwoRepeatingElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(3, 3).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(3, 3), solution.toIntArray())
    }

    @Test
    fun testFourElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(3, 7, 4, 2).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(3, 4, 2, 7), solution.toIntArray())
    }

    @Test
    fun testFiveElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(3, 7, 1, 2, 10).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(2, 3, 1, 7, 10), solution.toIntArray())
    }

    @Test
    fun testSixElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(5, 7, 8, 2, 10, 7).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(7, 7, 2, 8, 5, 10), solution.toIntArray())
    }

    @Test
    fun testSevenElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(5, 7, 8, 2, 10, 7, 1).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(5, 7, 1, 7, 8, 10, 2), solution.toIntArray())
    }

    @Test
    fun testEightElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(5, 7, 8, 2, 10, 7, 1, 6).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(1, 2, 5, 6, 7, 7, 8, 10), solution.toIntArray())
    }

    @Test
    fun testNineElements() {
        val maximizeValue = MaximizeValue()
        val solution = maximizeValue.solve(intArrayOf(5, 7, 8, 2, 10, 7, 1).toList().toTypedArray())
        Assert.assertArrayEquals(intArrayOf(5, 7, 1, 7, 8, 10, 2), solution.toIntArray())
    }
}