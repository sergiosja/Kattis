fun main() {
    for (i in 1..readLine()!!.toInt()) {
        var p = mutableListOf<String>()
        for (j in 1..readLine()!!.toInt()) {
            p.add(readLine()!!)
        }

        check(p.sorted())
    }
}

fun check(p: List<String>) {
    for (j in 1..p.size-1) {
        if (p[j].startsWith(p[j-1])) {
            println("NO")
            return
        }
    }
    println("YES")
}