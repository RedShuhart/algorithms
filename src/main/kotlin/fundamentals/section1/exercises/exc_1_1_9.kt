package fundamentals.section1.exercises

fun toBinary(num: Int): String {
    var n = num
    var result = ""
    while (n > 0) {
        result = (n % 2).toString() + result
        n /= 2
    }
    return result
}