fun main() {
    val s = readLine()!!
    var count = 0
    for (i in 1..s.length-1) {
        if (s.get(i) != s.get(i-1)) {
            count++
        }
    }

    println("${check(s, 'U', 'D')}\n" + "${check(s, 'D', 'U')}\n" + "$count")
}

fun check(s: String, c: Char, w: Char): Int {
    var count = 0
    if (s.get(0) == c && s.get(1) == w) count += 2
    else if (s.get(0) == c && s.get(1) == c) count = count
    else count++

    for (i in 2..s.length-1) {
        if (s.get(i) != c) {
            count += 2
        }
    }

    return count
}