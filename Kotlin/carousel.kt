fun main() {
    var (n, m) = readLine()!!.split(' ').map(String::toInt)

    while (n != 0) {
        val initial = mutableListOf<Pair<Pair<String, Double>, Double>>()

        for (i in 1..n) {
            val (a, b) = readLine()!!.split(' ').map(String::toDouble)
            if (a <= m) {
                initial.add("Buy ${a.toInt()} tickets for $${b.toInt()}" to b to b / a)
            }
        }

        if (initial.isEmpty()) {
            println("No suitable tickets offered")
        }
        else {
            val sorted = initial.sortedBy { it.second }
            val best = sorted.filter { it.second == sorted[0].second }

            if (best.size == 1) {
                println(best[0].first.first)
            }
            else {
                println(best.sortedBy{ it.first.second }[best.size-1].first.first)
            }
        }

        val tmp = readLine()!!.split(' ').map(String::toInt)
        n = tmp[0]
        m = tmp[1]
    }
}