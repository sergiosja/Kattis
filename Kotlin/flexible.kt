fun main() {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val l = readLine()!!.split(' ').map(String::toInt)
    val s: MutableSet<Int> = mutableSetOf(n)

    for (i in m-1 downTo 0) {
        s.add(l[i]-0)
        s.add(n-l[i])

        val curr = l[i]
        for (j in m-1 downTo 0) {
            if (curr > l[j]) {
                s.add(curr - l[j])
            }
        }
    }

    println(s.toSortedSet().joinToString(" "))
}