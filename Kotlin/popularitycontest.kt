fun main() {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val friends = IntArray(n+1){0 - it}

    for (i in 1..m) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        friends[a]++
        friends[b]++
    }

    for (i in 1..n) {
        print("${friends[i]} ")
    }
}