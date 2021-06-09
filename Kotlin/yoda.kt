fun main() {
    val upper = readLine()!!.reversed().map { it.toString().toInt() }
    val lower = readLine()!!.reversed().map { it.toString().toInt() }
    val m = Math.min(upper.size, lower.size)

    val nu: MutableList<Int> = mutableListOf()
    val nl: MutableList<Int> = mutableListOf()

    for (i in 0..m-1) {
        if (upper[i] > lower[i]) {
            nu.add(upper[i])
        } else if (lower[i] > upper[i]) {
            nl.add(lower[i])
        } else {
            nu.add(upper[i])
            nl.add(lower[i])
        }
    }

    val ol = listOf(upper, lower)
    val l = listOf(nu, nl)

    for (i in 0..1) {
        if (ol[i].size > m) {
            for (j in m..ol[i].size-1) {
                l[i].add(ol[i][j])
            }
        }

        if (l[i].isEmpty()) {
            println("YODA")
        } else if (l[i].sum() == 0) {
            println(0)
        } else {
            println(l[i].joinToString("").reversed())
        }
    }
}