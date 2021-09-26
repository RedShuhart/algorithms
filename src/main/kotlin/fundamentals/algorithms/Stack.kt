package fundamentals.algorithms

class Stack<T>: Iterable<T> {

    var root: Node? = null
        private set
    var size: Int = 0
        private set


    inner class Node(
        val item: T,
        var next: Node? = null
    )

    fun isEmpty() = size == 0;

    fun push(item: T) {
        val node = Node(item)

        node.next = root
        root = node

        size++
    }

    fun pop(): T? {
        if(isEmpty()) throw RuntimeException()

        val poppedItem = root?.item
        root = root?.next

        size--

        return poppedItem
    }


    fun peek(): T? {
        return if (isEmpty()) null  else root?.item
    }

    override fun  iterator(): Iterator<T> {
        return object: Iterator<T>{
            private var current: Stack<T>.Node? = root

            override fun hasNext(): Boolean {
                return current != null
            }

            override fun next(): T {
                val item = current!!.item
                current = current!!.next
                return item
            }
        }
    }

}