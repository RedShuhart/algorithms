package fundamentals.section3.exercises

import fundamentals.algorithms.Stack

internal val supportedOperators = listOf("+", "-", "*", "/")

fun toInfixExpression(expression: String): String {
    val operands = Stack<String>()
    val operators = Stack<String>()
    val inputValues = expression.chunked(1)
    inputValues.forEach { value ->
        when {
            value == "(" -> {}
            supportedOperators.contains(value) -> {
                operators.push(value)
            }
            value == ")" -> {
                val operator = operators.pop()
                val right = operands.pop()
                val left = operands.pop()
                val subExpression = "( $left $operator $right )"
                operands.push(subExpression)
            }
            else -> {
                operands.push(value)
            }
        }
    }
    return operands.pop()!!
}