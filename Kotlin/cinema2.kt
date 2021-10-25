fun main() {
    var (n, m) = readLine()!!.split(' ').map(String::toInt)
    val q = readLine()!!.split(' ').map(String::toInt)

    var counter = 0
    for (i in q) {
        if (n-i < 0) {
            println(m - counter)
            return
        }
        n -= i
        counter++
    }
    println(m-counter)
}