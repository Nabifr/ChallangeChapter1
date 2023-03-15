class KetupatBintang(private val rows: Int) {

    fun printPiramida() {
        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ") // cetak spasi untuk membuat pola piramida
            }

            var k = 0
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println() // pindah ke baris berikutnya
        }

        for (i in rows - 1 downTo 1) {
            for (space in 1..rows - i) {
                print("  ") // cetak spasi untuk membuat pola piramida
            }

            var k = 0
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println() // pindah ke baris berikutnya
        }
    }
}

fun main() {
    val piramida = KetupatBintang(7)
    piramida.printPiramida()
}
