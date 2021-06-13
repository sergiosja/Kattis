fun main() {
    readLine()!!
    val seq = readLine()!!.split(' ').map(String::toInt)
    val ans: MutableList<Int> = mutableListOf(seq[0])

    for (i in 1..seq.size-1) {
        if (seq[i] > ans[ans.size-1]) {
            ans.add(seq[i])
        }
    }

    println(ans.size)
    println(ans.joinToString(" "))
}