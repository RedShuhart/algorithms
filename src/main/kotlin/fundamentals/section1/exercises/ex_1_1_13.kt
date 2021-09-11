package fundamentals.section1.exercises

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val transposed = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}