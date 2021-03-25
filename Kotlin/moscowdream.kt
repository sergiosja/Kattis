fun main() {
    var (a, b, c, n) = readLine()!!.split(' ').map(String::toInt)
    if (a < 1 || b < 1 || c < 1 || n > (a + b + c) || n < 3) println("NO") else println("YES")
}