package fundamentals.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun test() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val actual = BinarySearch.findIndex(5, arr)
        val expected = 4
        assertEquals(expected, actual)
    }
}