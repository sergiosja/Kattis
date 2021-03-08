fun main() {
    var (a, b, c) = readLine()!!.split(' ').map(String::toInt)
    val (i, j, k) = readLine()!!.split(' ').map(String::toInt)

    val orange = 1.0 * a / i
    val apple = 1.0 * b / j
    val pineapple = 1.0 * c / k
    val min = minOf(minOf(orange, apple), pineapple)

    println("${a - min * i} ${b - min * j} ${c - min * k}")
}