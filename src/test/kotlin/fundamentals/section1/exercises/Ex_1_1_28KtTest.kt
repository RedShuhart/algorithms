package fundamentals.section1.exercises

import kotlin.test.Test
import kotlin.test.assertTrue

class Ex_1_1_28KtTest {

    @Test
    fun testWithIndex() {
        val arr = intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 6)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        val actual = removeDuplicatesWithIndex(arr)
        assertTrue { expected contentEquals actual }
    }

    @Test
    fun testWithArray() {
        val arr = intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 6)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        val actual = removeDuplicatesWithArray(arr)
        assertTrue { expected contentEquals  actual }
    }

}