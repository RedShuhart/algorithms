package fundamentals.section3.exercises

import fundamentals.algorithms.Stack

internal val supportedOperators = listOf("+", "-", "*", "/")

fun toInfixExpression(input: String): String {
    val operands = Stack<String>()
    val operators = Stack<String>()
    val inputValues = input.chunked(1)
    inputValues.forEach { value ->
        when {
            value == "(" -> {}
            supportedOperators.contains(value) -> {
                operators.push(value)
            }
            value == ")" -> {
                val operator = operators.pop()
                val value2 = operands.pop()
                val value1 = operands.pop()
                val subExpression = "( $value1 $operator $value2 )"
                operands.push(subExpression)
            }
            else -> {
                operands.push(value)
            }
        }
    }
    return operands.pop()!!
}