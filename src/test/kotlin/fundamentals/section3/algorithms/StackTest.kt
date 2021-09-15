package fundamentals.section3.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StackTest {

    @Test
    fun shouldPushItem() {
        val stack = Stack<Int>()

        stack.push(1)

        assertEquals(1, stack.peek())
        assertEquals(1, stack.size)

    }

    @Test
    fun shouldPopItem() {
        val stack = Stack<Int>()

        stack.push(1)

        assertEquals(1,stack.size)
        assertEquals(1,stack.pop())
        assertEquals(0, stack.size)
    }

    @Test
    fun shouldPushMultipleItemsAndPeekProperRoot() {
        val stack = Stack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.size)
        assertEquals(3, stack.peek())
    }

    @Test
    fun shouldPushMultipleItemsAndPopProperRoot() {
        val stack = Stack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.size)
        assertEquals(3, stack.pop())
        assertEquals(2, stack.size)
        assertEquals(2, stack.peek())
    }

    @Test
    fun iteratorShouldReturnProperNext() {
        val stack = Stack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        val iterator = stack.iterator()
        assertTrue { stack.iterator().hasNext() }
        assertEquals(3, iterator.next() )
        assertEquals(2, iterator.next() )
        assertEquals(1, iterator.next() )
    }
}