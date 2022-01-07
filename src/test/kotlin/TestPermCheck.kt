import org.junit.Test
import kotlin.test.assertEquals

/*
https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/

A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

fun solution(A: IntArray): Int

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
 */
class TestPermCheck {

    @Test
    fun test0() {
        val input = intArrayOf(1)
        val solution = PermCheck().solution(input)
        assertEquals(1, solution)
    }

    @Test
    fun test1() {
        val input = intArrayOf(2)
        val solution = PermCheck().solution(input)
        assertEquals(0, solution)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 1, 5, 4, 3)
        val solution = PermCheck().solution(input)
        assertEquals(1, solution)
    }

    @Test
    fun test3() {
        val input = intArrayOf(2, 5, 4, 3)
        val solution = PermCheck().solution(input)
        assertEquals(0, solution)
    }

    @Test
    fun test4() {
        val input = intArrayOf(2, 5, 4, 3, 1, 2)
        val solution = PermCheck().solution(input)
        assertEquals(0, solution)
    }

    @Test
    fun test5() {
        val input = intArrayOf(2, 4, 3, 1, 2)
        val solution = PermCheck().solution(input)
        assertEquals(0, solution)
    }

    @Test
    fun test6() {
        val input = intArrayOf(2, 5, 4, 3, 1, 2, 6)
        val solution = PermCheck().solution(input)
        assertEquals(0, solution)
    }
}