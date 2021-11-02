import org.junit.Assert
import org.junit.Test

class PickingTicketsTest {

    @Test
    fun testOneTicket() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(1000).toList().toTypedArray())
        Assert.assertEquals(1, solution)
    }

    @Test
    fun testTwoSortedNumbersUnbroken() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(2, 2).toList().toTypedArray())
        Assert.assertEquals(2, solution)
    }

    @Test
    fun testTwoUnsortedNumbersUnbroken() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(2, 1).toList().toTypedArray())
        Assert.assertEquals(2, solution)
    }

    @Test
    fun testThreeSortedNumbersBroken() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(1, 3, 4).toList().toTypedArray())
        Assert.assertEquals(2, solution)
    }

    @Test
    fun testThreeUnsortedNumbersBroken() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(4, 3, 1).toList().toTypedArray())
        Assert.assertEquals(2, solution)
    }

    @Test
    fun testManyUnbrokenUnsortedSequence() {
        val pickingTickets = PickingTickets()
        val solution = pickingTickets.solve(intArrayOf(1, 4, 3, 15, 6, 19, 8, 20, 18, 16, 7, 17).toList().toTypedArray())
        Assert.assertEquals(6, solution)
    }
}