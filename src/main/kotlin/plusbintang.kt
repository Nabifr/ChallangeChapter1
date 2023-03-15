class TandaPlusBintang(private val length: Int) {
    fun printTandaPlus() {
        for (i in 1..length) {
            for (j in 1..length) {
                if (i == length / 2 + 1 || j == length / 2 + 1) {
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
    val tandaPlus = TandaPlusBintang(7)
    tandaPlus.printTandaPlus()
}
