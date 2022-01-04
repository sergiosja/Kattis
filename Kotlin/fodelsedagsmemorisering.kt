fun main() {
    val f = mutableMapOf<String, Pair<String, Int>>()

    for (i in 1..readLine()!!.toInt()) {
        val (s, l, d) = readLine()!!.split(' ')

        if (f.get(d) == null) {
            f.put(d, s to l.toInt())
        } else {
            if (f.get(d)!!.second < l.toInt()) {
                f.put(d, s to l.toInt())
            }
        }
    }

    f.map{ it.value.first }.sortedBy { it }.also{ println(f.size) }.forEach{ println(it) }
}