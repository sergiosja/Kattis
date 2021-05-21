import kotlin.math.*

fun main() {
    val n = readLine()!!.toInt()

    if (n % 2 != 0) {
        println("still running")
        return
    }

    var sum = 0
    for (i in 0..(n-1)/2) {
        sum += abs(readLine()!!.toInt() - readLine()!!.toInt())
    }

    println(sum)
}