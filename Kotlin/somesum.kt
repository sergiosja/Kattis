fun main() {
    val n = readLine()!!.toInt()
    if (n % 2 != 0) println("Either") else if (n == 2 || n == 6 || n == 10) println("Odd") else println("Even")
}