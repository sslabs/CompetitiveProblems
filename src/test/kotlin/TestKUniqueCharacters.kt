import org.junit.Test
import kotlin.test.assertEquals

class TestKUniqueCharacters {

    @Test
    fun testThreeEqualChars() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("1aaa")
        assertEquals("aaa", result)
    }

    @Test
    fun testOneRepeatingChar() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("1aaab")
        assertEquals("aaa", result)
    }

    @Test
    fun testTwoRepeatingChars() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("2aaab")
        assertEquals("aaab", result)
    }

    @Test
    fun testTwoRepeatingNotFirstFound() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("2aaabbbbbbcccccc")
        assertEquals("bbbbbbcccccc", result)
    }

    @Test
    fun testChallengeCaseOne() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("3aabacbebebe")
        assertEquals("cbebebe", result)
    }

    @Test
    fun testChallengeCaseTwo() {
        val resolver = KUniqueCharacters()
        val result = resolver.solve("2aabbcbbbadef")
        assertEquals("bbcbbb", result)
    }
}