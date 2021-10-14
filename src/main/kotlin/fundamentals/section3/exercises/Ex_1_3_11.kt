package fundamentals.section3.exercises

import fundamentals.algorithms.Stack

typealias Operation = (operand1: Double, operand2: Double) -> Double

val Addition: Operation = { operand1, operand2 -> operand1 + operand2 }
val Subtraction: Operation = { operand1, operand2 -> operand1 - operand2 }
val Multiplication: Operation = { operand1, operand2 -> operand1 * operand2 }
val Division: Operation = { operand1, operand2 -> operand1 / operand2 }

val operatorToOperation = mapOf(
    "+" to Addition,
    "-" to Subtraction,
    "*" to Multiplication,
    "/" to Division
)

fun evaluatePostfix(postfixExpression: String): Double {
    val operands = Stack<Double>()
    val values = postfixExpression.chunked(1).filter { it.isNotBlank() }
    values.forEach { value ->
        when {
            supportedOperators.contains(value) -> {
                val operand2 = operands.pop()!!
                val operand1 = operands.pop()!!
                val result = operatorToOperation.getValue(value).invoke(operand1, operand2)
                operands.push(result)
            }
            else -> {
                operands.push(value.toDouble())
            }
        }
    }
    return operands.pop()!!
}