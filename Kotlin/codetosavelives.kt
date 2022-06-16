fun m() = readLine()!!
    .replace(" ", "")
    .toInt()

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        (m() + m())
            .toString()
            .map{ it.toString() }
            .joinToString(" ")
            .also(::println)
    }
}