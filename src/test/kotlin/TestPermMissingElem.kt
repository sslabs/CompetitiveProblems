import org.junit.Test
import kotlin.test.assertEquals

/*
https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/

An array A consisting of N different integers is given. The array contains
 integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
*/
class TestPermMissingElem {

    @Test
    fun test0() {
        val A = intArrayOf()
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(1, solution)
    }

    @Test
    fun test1() {
        val A = intArrayOf(1)
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(2, solution)
    }

    @Test
    fun test2() {
        val A = intArrayOf(2)
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(1, solution)
    }

    @Test
    fun test3() {
        val A = intArrayOf(1, 2, 4)
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(3, solution)
    }

    @Test
    fun test4() {
        val A = intArrayOf(2, 3, 4)
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(1, solution)
    }

    @Test
    fun test5() {
        val A = intArrayOf(1, 2, 3)
        val solution : Int = PermMissingElem().solution(A)
        assertEquals(4, solution)
    }
}