import kotlin.math.pow

fun main() {
    readLine()!!
        .split(" ")
        .map(String::toInt)
        .also{ (n, e) -> (0..n)
        .filter{ "${2.toDouble().pow(e.toDouble()).toInt()}" in it.toString() }
        .also{ println(it.size) }}
}