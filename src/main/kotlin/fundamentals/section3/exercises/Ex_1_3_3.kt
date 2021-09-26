package fundamentals.section3.exercises

import fundamentals.algorithms.Stack


internal val openToClosed = mapOf("(" to ")", "[" to "]", "{" to "}")

fun isBalanced(input: String): Boolean {
    val parentheses = input.chunked(1)
    val stack: Stack<String> = Stack()
    parentheses.forEach { parenthesis ->
        if (openToClosed.keys.contains(parenthesis)) {
            stack.push(parenthesis)
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val firstItem = stack.pop()
            if (firstItem.equals(openToClosed[parenthesis])) {
                return false
            }
        }
    }
    return stack.isEmpty()
}