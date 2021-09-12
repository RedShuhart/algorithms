package fundamentals.algorithms

object BinarySearch {
    fun findIndexIterative(key: Int, array: IntArray): Int {
        var start = 0
        var end = array.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            when {
                key < array[mid] -> end = mid - 1
                key > array[mid] -> start = mid + 1
                else -> return mid
            }
        }
        return -1
    }

    tailrec fun findIndexRecursive(key: Int, array: IntArray, start: Int, end: Int): Int {
        if (start > end) {
            return -1
        }
        val mid = (start + end) / 2
        return when {
            key == array[mid] -> mid
            key < array[mid] -> findIndexRecursive(key, array, start, mid - 1)
            else -> findIndexRecursive(key, array, mid + 1, end)
        }
    }

}