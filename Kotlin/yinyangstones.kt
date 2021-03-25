fun main() {
    val s = readLine()!!
    if (s.count{it == 'W'} == s.count{it == 'B'}) println(1) else println(0)
}