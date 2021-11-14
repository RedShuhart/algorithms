package fundamentals.section3.exercises

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex_1_3_14Test{

    @Test
    fun shouldCreateFixedSizeQueue() {
        val queue = FixedSizeArrayQueueOfStrings(5)
        queue.enqueue("1")
        queue.enqueue("2")
        queue.enqueue("3")
        queue.enqueue("4")
        queue.enqueue("5")
        queue.enqueue("6")

        val expectedMembersInOrder = arrayOf("1", "2", "3", "4", "5")

        assertEquals(5, queue.size)
        queue.forEachIndexed { index, member -> assertEquals(expectedMembersInOrder[index], member) }
    }

    @Test
    fun shouldCreateResizableQueue() {
        val queue = ResizingArrayQueueOfStrings(4)
        queue.enqueue("1")
        queue.enqueue("2")
        queue.enqueue("3")
        queue.enqueue("4")
        queue.enqueue("5")
        queue.enqueue("6")

        val expectedMembersInOrder = arrayOf("1", "2", "3", "4", "5", "6")

        assertEquals(6, queue.size)
        queue.forEachIndexed { index, member -> assertEquals(expectedMembersInOrder[index], member) }
    }

}