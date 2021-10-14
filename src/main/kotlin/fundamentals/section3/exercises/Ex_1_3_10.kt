package fundamentals.section3.exercises

import fundamentals.algorithms.Stack

fun toPostfixExpression(infixExpression: String): String {
    val operands = Stack<String> ()
    val operators = Stack<String> ()
    val inputValues = infixExpression.chunked(1)
    inputValues.forEach { value ->
        when {
            value == "(" -> {}
            supportedOperators.contains(value) -> {
                operators.push(value)
            }
            value == ")" -> {
                val value2 = operands.pop()
                val value1 = operands.pop()
                val operator = operators.pop()
                val newExpression = "$value1 $value2 $operator"
                operands.push(newExpression)
            }
            else -> {
                operands.push(value)
            }
        }
    }
    return operands.pop()!!
}