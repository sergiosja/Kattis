fun main() {
    var n = readLine()!!.toInt()
    var counter = 0

    while (n != 0) {
        println("List ${++counter}:")
        val a: HashMap<String, Int> = hashMapOf()

        for (i in 0..n-1) {
            val list: List<String> = readLine()!!.toLowerCase().split(' ')
            a.put(list[list.size-1], a.getOrElse(list[list.size-1]){0} + 1)
        }

        a.toSortedMap().forEach { (key, value) -> println("$key | $value") }
        n = readLine()!!.toInt()
    }
}