package fundamentals.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun testIterative() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val actual = BinarySearch.findIndexIterative(5, arr)
        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun testRecursive() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val actual = BinarySearch.findIndexRecursive(5, arr, 0, arr.size - 1)
        val expected = 4
        assertEquals(expected, actual)
    }
}