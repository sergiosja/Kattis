fun main() {
    val s = readLine()!!
    if (s.toCharArray().size == s.toSet().size) println(1) else println(0)
}