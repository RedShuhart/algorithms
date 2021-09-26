package fundamentals.section3.exercises


import kotlin.test.Test
import kotlin.test.assertEquals


class Ex_1_3_9KtTest {

    @Test
    fun shouldCorrectlyConvertToInfixExpression() {
        val input = "1+2)*3-4)*5-6)))"
        val expected = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )"
        val expression = toInfixExpression(input)
        assertEquals(expected, expression)
    }

}