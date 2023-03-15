fun printStarPyramid(numRows: Int) {
    for (i in 1..numRows) {
        for (j in 1..numRows-i) {
            print("  ") // print spasi
        }
        for (j in 1..2*i-1) {
            print("* ") // print bintang
        }
        println() // move to next line
    }
}

fun main() {
    printStarPyramid(8)
}
