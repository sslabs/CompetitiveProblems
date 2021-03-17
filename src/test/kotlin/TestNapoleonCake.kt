import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TestNapoleonCake {
    @Test
    fun testOneLayerNoCream() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 0, 0)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }

    @Test
    fun testOneLayerAllCreamByOne() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(1, 1, 1)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(1, 1, 1), result)
    }

    @Test
    fun testWasteOfCream() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 0, 1, 0, 4)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(0, 1, 1, 1, 1), result)
    }

    @Test
    fun testWasteOfSomeCream() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 0, 1, 0, 4, 0, 2)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(0, 1, 1, 1, 1, 1, 1), result)
    }

    @Test
    fun testFirstProblemSample() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 3, 0, 0, 1, 3)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(1, 1, 0, 1, 1, 1), result)
    }

    @Test
    fun testSecondProblemSample() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 0, 0, 1, 0, 5, 0, 0, 0, 2)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(0, 1, 1, 1, 1, 1, 0, 0, 1, 1), result)
    }

    @Test
    fun testThirdProblemSample() {
        val napoleonCake = NapoleonCake()
        val creams = listOf(0, 0, 0)
        val result = napoleonCake.drenched(creams)
        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }
}