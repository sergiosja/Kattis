fun main() {
    var n = readLine()!!.toInt()
    
    while (n != 0) {
        val names: MutableList<String> = mutableListOf()

        for (i in 1..n) {
            names.add(readLine()!!)
        }

        names.sortWith(compareBy<String> { it[0] }.thenBy{ it[1] })
        names.forEach{ println(it) }
        println("")

        n = readLine()!!.toInt()
    }
}