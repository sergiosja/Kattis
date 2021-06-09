fun main() {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val l = mutableListOf(0, 0, 0, 0, 0)
    var a = readLine()!!.toCharArray()

    for (i in 2..n) {
        val b = readLine()!!.toCharArray()

        for (j in 1..m-1) {
            val truck = listOf(a[j-1], a[j], b[j-1], b[j])
            var counter = 0

            for (k in truck) {
                if (k == '#') {
                    counter = -1
                    break
                }

                if (k == 'X') {
                    counter++
                }
            }

            if (counter >= 0) l[counter]++ else continue
        }

        a = b
    }

    l.forEach{ println(it) }
}