fun main() {
    val n = readLine()!!.toLong()
    var prev: Long = 1

    for (i in 1..n) {
        val eq = readLine()!!.split(' ')
        
        if (eq[1] == "+") {
            prev = eq[0].toLong() + eq[2].toLong() - prev
        }
        else if (eq[1] == "-") {
            prev = (eq[0].toLong() - eq[2].toLong()) * prev
        }
        else if (eq[1] == "*") {
            prev = Math.pow(eq[0].toDouble() * eq[2].toDouble(), 2.0).toLong()
        }
        else {
            prev = if (eq[0].toLong() % 2.toLong() == 0.toLong()) eq[0].toLong() / 2 else (eq[0].toLong() + 1) / 2
        }

        println(prev)
    }
}