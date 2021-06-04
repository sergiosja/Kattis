fun main() {
    val (a, b) = readLine()!!.split(' ')
    var (x, y) = getCord(a, b).split(' ').map(String::toInt)

    for (i in 0..b.length-1) {
        for (j in 0..a.length-1) {
            if (i == x) {
                print(a.get(j))
            }
            else if (j == y) {
                print(b.get(i))
            }
            else {
                print(".")
            }
        }
        println("")
    }
}

fun getCord(a: String, b: String): String {
    var (x, y) = listOf(0, 0)

    for (i in 0..b.length-1) {
        for (j in 0..a.length-1) {
            if (b.get(i) == a.get(j)) {
                x = i
                y = j
                return "$x $y"
            }
        }
    }

    return ""
}