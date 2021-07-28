fun main() {
    val tc = readLine()!!.toInt()

    for (i in 1..tc) {
        val (a, b) = readLine()!!.split(' ').map(String::toDouble)
        if ((b + 1) % Math.pow(2.0, a) == 0.0) println("Case #$i: ON") else println("Case #$i: OFF")
    }
}