fun main() {
    val (a, b, c, d) = readLine()!!.split(' ').map(String::toInt)
    val men: List<Int> = readLine()!!.split(' ').map(String::toInt)

    for (i in men) {
        var first = (i % (a+b) > 0 && i % (a+b) <= a)
        var second = (i % (c+d) > 0 && i % (c+d) <= c)

        if (first && second) println("both") else if (first || second) println("one") else println("none")
    }
}