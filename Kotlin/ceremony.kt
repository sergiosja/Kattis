fun main() {
    var n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map(String::toInt).sorted()
    var (chg, cut) = Pair(0, 0)

    for (v in s) {
        if (v - cut > 0) {
            chg++
            if (v - cut <= n) {
                cut++
            }
        }
        n--
    }
    println(chg)
}