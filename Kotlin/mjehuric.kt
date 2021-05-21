fun main() {
    var seq: MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

    while (seq != listOf(1, 2, 3, 4, 5)) {
        for (i in 1..seq.size-1) {
            if (seq[i-1] > seq[i]) {
                val tmp = seq[i-1]
                seq[i-1] = seq[i]
                seq[i] = tmp
                
                println(seq.joinToString(" "))
            }
        }
    }
}