package fundamentals.section3.exercises

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Ex_1_3_3KtTest {

    @Test
    fun givenStringShouldBeBalanced() {
        val parentheses = "()[]"
        assertTrue { isBalanced(parentheses) }
    }

    @Test
    fun givenStringShouldNotBeBalanced() {
        val parentheses = "{{{}}}}))((}"
        assertFalse { isBalanced(parentheses) }
    }

}