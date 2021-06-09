fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val s = readLine()!!
        if (s.contains("simon says ")) println(s.substring(11)) else println("")
    }
}