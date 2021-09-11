package fundamentals.algorithms

object BinarySearch {
    fun findIndex(key: Int, a: IntArray): Int {
        var start = 0
        var end = a.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            when {
                key < a[mid] -> end = mid - 1
                key > a[mid] -> start = mid + 1
                else -> return mid
            }
        }
        return -1
    }
}