fun main() {
    val n = readLine()!!.toInt()
    var counter = 1

    while (counter++ <= n) {
        val echo = readLine()!!
        if (counter % 2 == 0) {
            println(echo)
        }
    }
}