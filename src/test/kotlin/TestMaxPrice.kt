import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestMaxPrice {

    @Test
    fun `One day array`() {
        val sut = MaxPrice()
        val result = sut.solve(arrayOf(1))
        assertEquals(0, result)
    }

    @Test
    fun `test1`() {
        val sut = MaxPrice()
        val result = sut.solve(arrayOf(1, 2))
        assertEquals(1, result)
    }

    @Test
    fun `test2`() {
        val sut = MaxPrice()
        val result = sut.solve(arrayOf(7,1,5,3,6,4))
        assertEquals(5, result)
    }

    @Test
    fun `test3`() {
        val sut = MaxPrice()
        val result = sut.solve(arrayOf(7,6,4,3,1))
        assertEquals(0, result)
    }

    @Test
    fun `test4`() {
        val sut = MaxPrice()
        val result = sut.solve(arrayOf(7,2,9,1,3))
        assertEquals(7, result)
    }
}