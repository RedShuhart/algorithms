package fundamentals.section3.exercises


import kotlin.test.Test
import kotlin.test.assertEquals


class Ex_1_3_11KtTest {

    @Test
    fun shouldCorrectlyEvaluatePostfixExpression() {
        val input = "5 3 - 1 3 + *"
        val expected = 8.0
        val result = evaluatePostfix(input)
        assertEquals(expected, result)
    }

}