import kotlin.test.Test
import kotlin.test.assertEquals

class TestNewYearChaos {

    @Test
    fun `Zero length queue is always ordered`() {
        val sut = NewYearChaos()
        val result = sut.calculateMinimumBribes(arrayOf())
        assertEquals(0, result)
    }

    @Test
    fun `Sorted input`() {
        val sut = NewYearChaos()
        val result = sut.calculateMinimumBribes(arrayOf(1, 2, 3, 4))
        assertEquals(0, result)
    }

    @Test
    fun `Input {1, 2, 3, 5, 4, 6, 7, 8} needs 1 bribe`() {
        val sut = NewYearChaos()
        val result = sut.calculateMinimumBribes(arrayOf(1, 2, 3, 5, 4, 6, 7, 8))
        assertEquals(1, result)
    }

    @Test(expected = RuntimeException::class)
    fun `Input {4, 1, 2, 3} is too chaotic`() {
        val sut = NewYearChaos()
        sut.calculateMinimumBribes(arrayOf(4, 1, 2, 3))
    }

    @Test
    fun `Input {2, 1, 5, 3, 4} is too chaotic`() {
        val sut = NewYearChaos()
        val result = sut.calculateMinimumBribes(arrayOf(2, 1, 5, 3, 4))
        assertEquals(3, result)
    }

    @Test(expected = RuntimeException::class)
    fun `Input {2, 5, 1, 3, 4} is too chaotic`() {
        val sut = NewYearChaos()
        sut.calculateMinimumBribes(arrayOf(2, 5, 1, 3, 4))
    }

    @Test
    fun `Input {1, 2, 5, 3, 7, 8, 6, 4} is too chaotic`() {
        val sut = NewYearChaos()
        val result = sut.calculateMinimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4))
        assertEquals(7, result)
    }
}