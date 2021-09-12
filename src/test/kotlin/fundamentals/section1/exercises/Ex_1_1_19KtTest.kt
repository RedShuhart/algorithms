package fundamentals.section1.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex_1_1_19KtTest {

    @Test
    fun testIterative() {
        val actual = fibonacciIterative(10)
        val expected = 55
        assertEquals(expected, actual)
    }

    @Test
    fun testArray() {
        val actual = fibonacciArray(10)
        val expected = 55
        assertEquals(expected, actual)
    }

    @Test
    fun testRecursive() {
        val actual = fibonacciRecursive(10)
        val expected = 55
        assertEquals(expected, actual)
    }
}