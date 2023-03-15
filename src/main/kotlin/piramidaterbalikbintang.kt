class PiramidaBintangTerbalik(private val rows: Int) {

    fun printPiramida() {
        var k = 0

        for (i in rows downTo 1) {
            for (space in 1..rows - i) {
                print("  ") // cetak spasi untuk membuat pola piramida terbalik
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            k = 0
            println() // pindah ke baris berikutnya
        }
    }
}

fun main() {
    val piramida = PiramidaBintangTerbalik(8)
    piramida.printPiramida()
}
