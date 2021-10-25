fun main() {
    var last = readLine()!!.toLong()
    val seq = mutableListOf(last)

    while (last != 1.toLong()) {
        if (seq[seq.size-1] % 2 == 0.toLong()) {
            seq.add(last/2)
        } else {
            seq.add(last*3+1)
        }
        last = seq[seq.size-1]
    }
    println(seq.sum())
}