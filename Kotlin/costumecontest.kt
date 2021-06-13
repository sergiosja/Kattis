fun main() {
    val n = readLine()!!.toInt()
    val c: HashMap<String, Int> = hashMapOf()

    for (i in 1..n) {
        val co = readLine()!!
        c.put(co, c.getOrElse(co){0} + 1)
    }

    val min = c.minByOrNull { it.value }!!.value
    c.toSortedMap().forEach { (key, value) -> if (value == min) println(key) }
}