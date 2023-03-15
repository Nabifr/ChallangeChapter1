class SegitigaBintang(private val rows: Int) {
        fun printSegitiga() {
            for (i in 1..rows) {
                for (j in 1..i) {
                    print("* ")
                }
                println()
            }
        }
    }

    fun main() {
        val segitiga = SegitigaBintang(8)
        segitiga.printSegitiga()
    }