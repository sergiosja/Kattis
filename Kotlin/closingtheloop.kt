fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        readLine()!!
        var case = "Case #$i:"
        var counter = 0
        val ropes = readLine()!!.split(" ")
        var (red, blue) = Pair(mutableListOf<Int>(), mutableListOf<Int>())

        ropes.forEach {
            if (it.endsWith("B"))
                blue.add(it.dropLast(1).toInt())
            else
                red.add(it.dropLast(1).toInt())
        }

        if (red.isEmpty() || blue.isEmpty()) {
            println("$case 0")
            continue
        }

        red = red.sortedDescending().toMutableList()
        blue = blue.sortedDescending().toMutableList()

        var index = 0
        while (red.size > index && blue.size > index) {
            counter += red[index] + blue[index] - 2
            index++
        }

        println("$case $counter")
    }
}
