import org.junit.Test
import kotlin.test.assertEquals

class TestLongNumber {

    @Test
    fun testTranslateFunction() {
        val longNumber = LongNumber()
        val char = '2'
        val mapping = listOf(2, 3, 4, 5, 6, 7, 8, 9, 1)
        val result = longNumber.translate(char, mapping)
        assertEquals('3', result)
    }

    @Test
    fun testTranslateFunctionWithManyDigits() {
        val longNumber = LongNumber()
        val number = "123456789"
        val mapping = listOf(2, 3, 4, 5, 6, 7, 8, 9, 1)
        val result = number.toCharArray()
            .map { Character.getNumericValue(longNumber.translate(it, mapping)) }
        assertEquals(mapping, result)
    }

    @Test
    fun testNumberOneWithNoChanges() {
        val longNumber = LongNumber()
        val result = longNumber.replace( "1", listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        assertEquals("1", result)
    }

    @Test
    fun testChangingAllDigits() {
        val longNumber = LongNumber()
        val number = "11111"
        val mapping = listOf(9, 9, 9, 9, 9, 9, 9, 9, 9)
        val result = longNumber.replace( number, mapping)
        assertEquals("99999", result)
    }
}