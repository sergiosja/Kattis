fun main() {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val hm: HashMap<String, Int> = hashMapOf()

    for (i in 0..n-1) {
        val (word, amount) = readLine()!!.split(' ')
        hm.put(word, amount.toInt())
    }

    for (i in 0..m-1) {
        var salary = 0
        var line = readLine()!!

        while (line != ".") {
            val tmp: List<String> = line.split(' ')

            for (j in 0..tmp.size-1) {
                if (hm.containsKey(tmp.get(j))) {
                    val value = hm.get(tmp.get(j))
                    if (value != null) salary += value
                }
            }
            line = readLine()!!
        }
        println(salary)
    }
}