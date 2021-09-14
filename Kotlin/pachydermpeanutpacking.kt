fun main() {
    var n = readLine()!!.toInt()

    while (n != 0) {
        val elephant = mutableListOf<String>()
        val packets = mutableListOf<List<String>>()
        val nuts = mutableListOf<List<String>>()
        for (i in 1..n) {
            packets.add(readLine()!!.split(' '))
        }

        val m = readLine()!!.toInt()
        for (i in 1..m) {
            nuts.add(readLine()!!.split(' '))
        }

        for (i in nuts) {
            var done = false
            for (j in packets) {
                if (i[0].toDouble() >= j[0].toDouble() && i[0].toDouble() <= j[2].toDouble()) {
                    if (i[1].toDouble() >= j[1].toDouble() && i[1].toDouble() <= j[3].toDouble()) {
                        if (i[2] == j[4]) {
                            elephant.add("${i[2]} correct")
                        }
                        else {
                            elephant.add("${i[2]} ${j[4]}")
                        }
                        done = true
                    }
                }
                if (done) {
                    break
                }
            }
            if (!done) {
                elephant.add("${i[2]} floor")
            }
        }

        for (i in elephant) {
            println(i)
        }
        println()
        n = readLine()!!.toInt()
    }
}