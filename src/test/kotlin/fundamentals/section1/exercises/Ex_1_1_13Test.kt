package fundamentals.section1.exercises

import kotlin.test.Test
import kotlin.test.assertTrue

class Ex_1_1_13Test {

    @Test
    fun test() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
        val expected = arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6))
        val transposed = transpose(matrix)
        assertTrue { expected contentDeepEquals transposed }
    }
}