fun main() {
    val (m, n) = readLine()!!.split(" ").map(String::toInt)
    val dancers = mutableListOf<CharArray>()
    val gap = IntArray(n){1}

    for (i in 0..m-1) {
        dancers.add(readLine()!!.toCharArray())
    }

    for (i in dancers)
        for (j in 0..i.size-1)
            if (i[j] == '$')
                gap[j] = 0

    println(gap.filter{ it == 1 }.size + 1)
}