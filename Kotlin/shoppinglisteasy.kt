fun main() {
    var (n, _) = readLine()!!.split(' ').map(String::toInt)
    val sl: HashMap<String, Int> = hashMapOf()
    var input: List<String> = readLine()!!.split(' ')

    for (i in input) {
        sl.put(i, 1)
    }

    for (i in 0..n-2) {
        input = readLine()!!.split(' ')
        
        for (j in input) {
            if (sl.containsKey(j)) {
                sl.put(j, sl.getOrElse(j){0}+1)
            }
        }
    }

    var counter = 0
    sl.forEach { (_, value) -> if (value == n) counter++ }

    println(counter)
    sl.toSortedMap().forEach { (key, value) -> if (value == n) println(key) }
}