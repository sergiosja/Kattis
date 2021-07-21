fun main() {
    var d = readLine()!!.split(' ').map(String::toInt)

    while (d != listOf(0, 0, 0, 0)) {
        val p1 = (Math.max(d[0], d[1]).toString() + Math.min(d[0], d[1]).toString()).toInt()
        val p2 = (Math.max(d[2], d[3]).toString() + Math.min(d[2], d[3]).toString()).toInt()

        if (p1 == 21 && p2 == 12 || p1 == 12 && p2 == 21 || p1 == p2) {
            println("Tie.")
        }
        else if (p1 == 12 || p1 == 21) {
            println("Player 1 wins.")
        }
        else if (p2 == 12 || p2 == 21) {
            println("Player 2 wins.")
        }
        else {
            val pairs = listOf(66, 55, 44, 33, 22, 11)
            var done = false
            for (p in pairs) {
                if (p1 == p) {
                    println("Player 1 wins.")
                    done = true
                } else if (p2 == p) {
                    println("Player 2 wins.")
                    done = true
                }
                if (done) break
            }

            if (!done) {
                if (p1 > p2) {
                    println("Player 1 wins.")
                } else if (p2 > p1) {
                    println("Player 2 wins.")
                }
            }
        }

        d = readLine()!!.split(' ').map(String::toInt)
    }
}