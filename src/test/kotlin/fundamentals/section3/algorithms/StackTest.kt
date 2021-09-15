package fundamentals.section3.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class StackTest {

    @Test
    fun shouldPushItem() {
        val stack = Stack<Int>()

        stack.push(1)

        assertEquals(stack.peek(), 1)
        assertEquals(stack.size, 1)

    }

    @Test
    fun shouldPopItem() {
        val stack = Stack<Int>()

        stack.push(1)

        assertEquals(stack.size, 1)
        assertEquals(stack.pop(), 1)
        assertEquals(stack.size, 0)
    }

    @Test
    fun shouldPushMultipleItemsAndPeekProperRoot() {
        val stack = Stack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(stack.size, 3)
        assertEquals(stack.peek(), 3)
    }

    @Test
    fun shouldPushMultipleItemsAndPopProperRoot() {
        val stack = Stack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(stack.size, 3)
        assertEquals(stack.pop(), 3)
        assertEquals(stack.size, 2)
    }
}