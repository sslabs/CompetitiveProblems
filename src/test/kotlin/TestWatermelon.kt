import org.junit.Test
import kotlin.test.assertEquals

class TestWatermelon {
    @Test
    fun testWeightOfOne() {
        val watermelon = Watermelon()
        val weight = 1
        val result = watermelon.split(weight)
        assertEquals("NO", result)
    }

    @Test
    fun testWeightOfTwo() {
        val watermelon = Watermelon()
        val weight = 2
        val result = watermelon.split(weight)
        assertEquals("NO", result)
    }

    @Test
    fun testWeightOfThree() {
        val watermelon = Watermelon()
        val weight = 3
        val result = watermelon.split(weight)
        assertEquals("NO", result)
    }

    @Test
    fun testWeightOfEight() {
        val watermelon = Watermelon()
        val weight = 8
        val result = watermelon.split(weight)
        assertEquals("YES", result)
    }

    @Test
    fun testWeightOfNinetyNine() {
        val watermelon = Watermelon()
        val weight = 99
        val result = watermelon.split(weight)
        assertEquals("NO", result)
    }

    @Test
    fun testWeightOfOneHundred() {
        val watermelon = Watermelon()
        val weight = 100
        val result = watermelon.split(weight)
        assertEquals("YES", result)
    }
}