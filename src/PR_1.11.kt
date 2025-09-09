class Matrix(private val data: Array<IntArray>) {

    private val rows: Int = data.size
    private val cols: Int = data[0].size

    // Operator overloading for addition
    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must match for addition" }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Operator overloading for subtraction
    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must match for subtraction" }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Operator overloading for multiplication
    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) { "Matrix dimensions not valid for multiplication" }
        val result = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result)
    }

    // toString() for pretty printing
    override fun toString(): String {
        return data.joinToString("\n") { row -> row.joinToString("\t") }
    }
}

fun main(){
    val firstMatrix = Matrix(arrayOf(
         intArrayOf(3, -2, 5),
         intArrayOf(3, 0, 4)
     ))

     val secondMatrix = Matrix(arrayOf(
         intArrayOf(2, 3),
         intArrayOf(-9, 0),
         intArrayOf(0, 4)
     ))

     val secondMatrix1 = Matrix(arrayOf(
         intArrayOf(6, 3),
         intArrayOf(9, 0),
         intArrayOf(5, 4)
     ))

     println("Addition")
     println("Matrix 1:\n$secondMatrix1")
     println("Matrix 2:\n$secondMatrix")
     val addition = secondMatrix1 + secondMatrix
     println("Result:\n$addition")

     println("Subtraction")
     println("Matrix 1:\n$secondMatrix1")
     println("Matrix 2:\n$secondMatrix")
     val subtraction = secondMatrix1 - secondMatrix
     println("Result:\n$subtraction")

     println("Multiplication")
     println("Matrix 1:\n$firstMatrix")
     println("Matrix 2:\n$secondMatrix")
     val multiplication = firstMatrix * secondMatrix
     println("Result:\n$multiplication")

}