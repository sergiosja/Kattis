fun main() {
    val normal = readLine()!!
    val sticky = readLine()!!
    val set = mutableSetOf<Char>()

    for (c in normal) {
        if (normal.filter { it == c}.count() != sticky.filter { it == c}.count()) {
            set.add(c)
        }
    }

    println(set.joinToString(""))
}