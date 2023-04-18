import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 *
 * * This is a demo task.
 *
 * Write a function:
 *
 * fun solution(A: IntArray): Int
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
class TestMissingInteger {

    @Test
    fun test0() {
        val A = intArrayOf()
        val result = MissingInteger.solution(A)
        assertEquals(1, result)
    }

    @Test
    fun test1() {
        val A = intArrayOf(1, 2, 3)
        val result = MissingInteger.solution(A)
        assertEquals(4, result)
    }

    @Test
    fun test2() {
        val A = intArrayOf(-1, -2, -3)
        val result = MissingInteger.solution(A)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val A = intArrayOf(-2, -3, 5)
        val result = MissingInteger.solution(A)
        assertEquals(1, result)
    }

    @Test
    fun test4() {
        val A = intArrayOf(-2, -3, 5, 1, 2)
        val result = MissingInteger.solution(A)
        assertEquals(3, result)
    }

    @Test
    fun test5() {
        val A = intArrayOf(-1, -3)
        val result = MissingInteger.solution(A)
        assertEquals(1, result)
    }

    @Test
    fun test6() {
        val A = intArrayOf(1, 3, 6, 4, 1, 2)
        val result = MissingInteger.solution(A)
        assertEquals(5, result)
    }
}