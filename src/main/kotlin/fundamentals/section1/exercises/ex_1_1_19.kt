package fundamentals.section1.exercises

 fun fibonacciRecursive(n: Int): Int {
    if (n == 0) return 0
    return if (n == 1) 1 else fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
}

fun fibonacciArray(num: Int): Int = when (num) {
    0 -> 0
    1 -> 1
    else -> {
        val arr = (0..num).toList().toTypedArray()
        for (i in 2..num) {
            arr[i] = arr[i - 2] + arr[i - 1]
        }
        arr[num]
    }
}

fun fibonacciIterative(num: Int): Int {
    var previousPrevious: Int
    var previous = 0
    var current = 1
    for (i in 1 until num) {
        previousPrevious = previous
        previous = current
        current = previousPrevious + previous
    }
    return current
}