package fundamentals.section3.exercises

abstract class QueueOfStrings : Iterable<String> {
    var size = 0
    protected var head = 0
    protected var tail = 0
    protected var capacity: Int = 0;
    protected lateinit var array: Array<String?>

    abstract fun enqueue(s: String)
    abstract fun dequeue(): String

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun isFull(): Boolean {
        return size == array.size
    }

    override fun iterator(): Iterator<String> {
        return object: Iterator<String>{
            private var front: Int = head
            private var count = 0
            override fun hasNext(): Boolean {
                return ++count <= size
            }

            override fun next(): String {
                if (front == capacity) {
                    front = 0
                }
                return array[front++]!!
            }
        }
    }
}

class FixedSizeArrayQueueOfStrings(private val maxCapacity: Int): QueueOfStrings() {
    init {
        array = arrayOfNulls(maxCapacity)
    }

    override fun enqueue(s: String) {
        if (!isFull()) {
            if (tail == maxCapacity) {
                tail = 0
            }
            array[tail++] = s
            size++
        }
    }

    override fun dequeue(): String {
        check(!isEmpty()) { "queue is empty!" }
        if (head == maxCapacity) {
            head = 0
        }
        val ret = array[head]
        array[head] = null
        head++
        size--
        return ret!!
    }
}

class ResizingArrayQueueOfStrings(private var maxCapacity: Int): QueueOfStrings() {
    init {
        array = arrayOfNulls(maxCapacity)
    }

    override fun enqueue(s: String) {
        if (isFull()) {
            resize(size * 2)
        }
        if (tail == maxCapacity) {
            tail = 0
        }
        array[tail++] = s
        size++
    }

    override fun dequeue(): String {
        if (size == array.size / 4) {
            resize(array.size / 2)
        }
        if (head == maxCapacity) {
            head = 0
        }
        val ret = array[head]
        array[head] = null
        head++
        size--
        return ret!!
    }

    private fun resize(capacity: Int) {
        val copy = arrayOfNulls<String>(capacity)
        var i = 0
        for (item in this) {
            copy[i++] = item
        }
        head = 0
        tail = i
        maxCapacity = capacity
        array = copy
    }
}

