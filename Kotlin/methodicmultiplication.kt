fun main() {
    val a = readLine()!!
    val b = readLine()!!

    if (a == "S(0)") {
        println(b)
    }
    else if (b == "S(0)") {
        println(a)
    }
    else if (a == "0" || b == "0") {
        println(0)
    }
    else {
        val n = a.filter { it == 'S' }.count() * b.filter { it == 'S' }.count()
        println("S(".repeat(n) + "0" + ")".repeat(n))
    }
}