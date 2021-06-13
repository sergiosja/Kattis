fun main() {
    for (i in 1..readLine()!!.toInt()) {
        var (c, b, n) = readLine()!!.split(' ').map(String::toDouble)
        var sum = 0.0

        while (n > 0) {
            sum += Math.pow(n % b, 2.0)
            n = Math.floor(n / b)
        }

        println("${c.toInt()} ${sum.toInt()}")
    }
}