// note: kattis compiler requires ToLowerCase
fun main() {
    val n = readLine()!!.toInt()
    val s = mutableSetOf<String>()
    for (i in 1..n)
        s.add(readLine()!!.lowercase().replace('-', ' '))
    println(s.size)
}
