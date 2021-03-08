fun main() {
    val n = readLine()!!.toInt()
    val b: List<Int> = readLine()!!.split(' ').map(String::toInt)
    var t = 1
    for (i in 1..n-1) {
        if (b.get(i) > b.get(i-1)) {
            t++
        }
    }

    println(t)
}