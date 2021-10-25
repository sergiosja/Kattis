fun main() {
    val n = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val x = if (n2 >= n) n2 - n else n2 + 360 - n
    val y = if (n >= n2) n2 - n else n2 - (n + 360)
    if (Math.abs(y) >= Math.abs(x)) println(x) else println(y)
}