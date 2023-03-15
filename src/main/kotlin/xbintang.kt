class XPattern(private val length: Int) {
    fun printPattern() {
        for (i in 0 until length) {
            for (j in 0 until length) {
                if (i == j || i + j == length - 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

fun main() {
    val xPattern = XPattern(15)
    xPattern.printPattern()
}
