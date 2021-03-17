import org.junit.Test
import kotlin.test.assertEquals

class TestReachableNumbers {

    @Test
    fun testRemoveNoZeros() {
        val reachable = ReachableNumbers()
        val result = reachable.removeTrailingZeros(1003)
        assertEquals(1003, result)
    }

    @Test
    fun testRemoveOneZero() {
        val reachable = ReachableNumbers()
        val result = reachable.removeTrailingZeros(10030)
        assertEquals(1003, result)
    }

    @Test
    fun testRemoveManyZeros() {
        val reachable = ReachableNumbers()
        val result = reachable.removeTrailingZeros(1003000)
        assertEquals(1003, result)
    }

    @Test
    fun testReducingFunctionByTen() {
        val reachable = ReachableNumbers()
        val result = reachable.f(10)
        assertEquals(11, result)
    }

    @Test
    fun testReducingFunctionByNine() {
        val reachable = ReachableNumbers()
        val result = reachable.f(9)
        assertEquals(1, result)
    }

    @Test
    fun testReachablesOfNine() {
        val readable = ReachableNumbers()
        val result = readable.count(9)
        assertEquals(9, result)
    }

    @Test
    fun testReachablesOfTen() {
        val readable = ReachableNumbers()
        val result = readable.count(10)
        assertEquals(19, result)
    }

    @Test
    fun testReachablesOfOneThousandNinetyEight() {
        val readable = ReachableNumbers()
        val result = readable.count(1098)
        assertEquals(20, result)
    }
}