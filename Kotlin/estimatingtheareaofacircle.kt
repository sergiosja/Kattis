fun main() {
    while (true) {
        val (r, m, n) = readLine()!!.split(' ').map(String::toDouble)

        if (m == 0.0) {
            break
        }

        println("${Math.PI * Math.pow(r, 2.0)} ${n / m * Math.pow(r * 2, 2.0)}")
    }
}