import org.junit.Assert.assertArrayEquals
import org.junit.Test
/*
https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
class CyclicRotationTest {

    @Test
    fun test0() {
        val inputArray = IntArray(0)
        val k = 0
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(IntArray(0), result)
    }

    @Test
    fun test1() {
        val inputArray = intArrayOf(1)
        val k = 1
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(intArrayOf(1), result)
    }

    @Test
    fun test2() {
        val inputArray = intArrayOf(1, 2, 3)
        val k = 1
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(intArrayOf(3, 1, 2), result)
    }

    @Test
    fun test3() {
        val inputArray = intArrayOf(1, 2, 3)
        val k = 2
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(intArrayOf(2, 3, 1), result)
    }

    @Test
    fun test4() {
        val inputArray = intArrayOf(1, 2, 3)
        val k = 3
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(intArrayOf(1, 2, 3), result)
    }

    @Test
    fun test5() {
        val inputArray = intArrayOf(1, 2, 3)
        val k = 4
        val result : IntArray = CyclicRotation().solution(inputArray, k)
        assertArrayEquals(intArrayOf(3, 1, 2), result)
    }
}