import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class TestMergeTwoSortedLinkedLists {

    @Test
    fun `Both lists are empty`() {
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(null, null)
        assertNull(result)
    }

    @Test
    fun `Second list is empty`() {
        val first = Node.build(listOf(1, 2, 3))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(first, null)
        assertEquals(Node.build(listOf(1, 2, 3)), result)
    }

    @Test
    fun `First list is empty`() {
        val second = Node.build(listOf(1, 2, 3))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(null, second)
        assertEquals(Node.build(listOf(1, 2, 3)), result)
    }

    @Test
    fun `Lists have the same elements`() {
        val first = Node.build(listOf(1, 2, 3))
        val second = Node.build(listOf(1, 2, 3))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(first, second)
        assertEquals(Node.build(listOf(1, 1, 2, 2, 3, 3)), result)
    }

    @Test
    fun `Test 1`() {
        val first = Node.build(listOf(1, 2, 3))
        val second = Node.build(listOf(2, 3))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(first, second)
        assertEquals(Node.build(listOf(1, 2, 2, 3, 3)), result)
    }

    @Test
    fun `Test 2`() {
        val first = Node.build(listOf(1, 3, 5))
        val second = Node.build(listOf(2, 3))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(first, second)
        assertEquals(Node.build(listOf(1, 2, 3, 3, 5)), result)
    }

    @Test
    fun `Test 3`() {
        val first = Node.build(listOf(1, 3, 7))
        val second = Node.build(listOf(1, 2))
        val sut = MergeTwoSortedLinkedLists()
        val result = sut.solve(first, second)
        assertEquals(Node.build(listOf(1, 1, 2, 3, 7)), result)
    }
}