fun main() {
    val n = readLine()!!.toInt()
    val l: MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()
    var a = 0
    var b = 0
    var aturn = true

    while (l.size > 0) {
        var max = Integer.MIN_VALUE
        var maxindx = 0

        for (i in 0..l.size-1) {
            if (l.get(i) > max) {
                max = l.get(i)
                maxindx = i
            }
        }
        l.removeAt(maxindx)

        if (aturn) a += max else b += max
        if (aturn) aturn = false else aturn = true
    }

    println("$a $b")
}