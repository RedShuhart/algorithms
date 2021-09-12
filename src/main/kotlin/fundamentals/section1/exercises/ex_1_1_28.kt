package fundamentals.section1.exercises


fun removeDuplicatesWithIndex(arr: IntArray): IntArray {
    var index = 0
    val clone = arr.clone()

    for (i in arr.indices) {
        if (clone[index] != clone[i]) {
            clone[++index] = clone[i]
        }
    }

    return clone.copyOfRange(0, index + 1)
}

fun removeDuplicatesWithArray(arr: IntArray): IntArray {

    val size = arr.size
    val temp = IntArray(size)

    var j = 0
    for (i in 0 until size - 1) {
        if (arr[i] != arr[i + 1]) {
            temp[j++] = arr[i]
        }
    }

    temp[j++] = arr[size - 1]

    return temp.copyOfRange(0, j)
}