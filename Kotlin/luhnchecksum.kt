fun main() {
    val n = readLine()!!.toInt()
    for (i in 0..n-1) {
        val l = readLine()!!.toCharArray()

        for (j in l.size-2 downTo 0 step 2) {

            if (l[j] == '0') {
                continue
            }

            if (l[j].toString().toInt() * 2 >= 10) {
                val tmp = (l[j].toString().toInt() * 2).toString()
                l[j] = (tmp[0].toString().toInt() + tmp[1].toString().toInt() + 48).toChar()
            }
            else {
                l[j] = (l[j].toString().toInt() * 2 + 48).toChar()
            }
        }

        if (l.sumBy { it.toString().toInt() } % 10 == 0) println("PASS") else println("FAIL")
    }
}