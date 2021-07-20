fun main() {
    val (_, n) = readLine()!!.split(' ').map(String::toInt)
    val cl = readLine()!!.split(' ').map(String::toInt).toMutableList()

    for (i in 1..n) {
        val (cmd, a, b) = readLine()!!.split(' ').map(String::toInt)
        if (cmd == 1) {
            cl[a-1] = b
        } else {
            println(Math.abs(cl[a-1] - cl[b-1]))
        }
    }
}