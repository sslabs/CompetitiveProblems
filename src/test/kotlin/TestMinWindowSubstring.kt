import org.junit.Test
import kotlin.test.assertEquals

class TestMinWindowSubstring {

    @Test
    fun testKEqualsToN() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("abc", "abc"))
        assertEquals("abc", result)
    }

    @Test
    fun testKLargerThenN() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("fsdfafadfaf", "dfs"))
        assertEquals("fsd", result)
    }

    @Test
    fun testMinSequenceAfterABiggerOne() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("poewkiuspwsdfpwlsaw", "pws"))
        assertEquals("spw", result)
    }

    @Test
    fun testMinSequenceAfterABiggerTwo() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("poewswwwsdfpwlsaw", "pws"))
        assertEquals("pwls", result)
    }

    @Test
    fun testMinSequenceAfterABiggerThree() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("aaabcbe", "abe"))
        assertEquals("abcbe", result)
    }

    @Test
    fun testChallengeSampleOne() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("ahffaksfajeeubsne", "jefaa"))
        assertEquals("aksfaje", result)
    }

    @Test
    fun testChallengeSampleTwo() {
        val resolver = MinWindowSubstring()
        val result: String = resolver.solve(arrayOf("aaffhkksemckelloe", "fhea"))
        assertEquals("affhkkse", result)
    }
}