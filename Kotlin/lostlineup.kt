fun main() {
    val n = readLine()!!.toInt()
    if (n == 1) {
        println(1)
        return
    }

    val q: MutableList<Int> = mutableListOf(1)
    val inlist: List<Int> = readLine()!!.split(' ').map(String::toInt)
    var lastmin = -1
    for (i in 0..inlist.size-1) {
        var max = 101
        var indx = 0

        for (j in 0..inlist.size-1) {
            if (inlist[j] > lastmin && inlist[j] < max) {
                max = inlist[j]
                indx = j+2
            }
        }

        q.add(indx)
        lastmin = max
    }

    println(q.joinToString(" "))
}