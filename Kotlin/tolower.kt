fun main() {
    val (p, t) = readLine()!!.split(' ').map(String::toInt)
    var total = 0

    for (i in 0..p-1) {
        val a: MutableList<String> = mutableListOf()

        for (j in 0..t-1) {
            a.add(readLine()!!)
        }

        val array: List<String> = a.map{it.get(0).toLowerCase() + it.substring(1)}
        var counter = 0

        for (j in 0..t-1) {
            if (array.get(j).equals(array.get(j).toLowerCase())) {
                counter++
            }
        }

        if (counter == t) {
            total++
        }
    }

    println(total)
}