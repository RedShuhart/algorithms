package fundamentals.section3.exercises


import kotlin.test.Test
import kotlin.test.assertEquals


class Ex_1_3_10KtTest {

    @Test
    fun shouldCorrectlyConvertToPostfixExpression() {
        val input = "((1+2)*(4/2))"
        val expected = "1 2 + 4 2 / *"
        val expression = toPostfixExpression(input)
        assertEquals(expected, expression)
    }

}