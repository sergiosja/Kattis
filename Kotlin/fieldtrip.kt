fun main() {
    val n = readLine()!!.toInt()
    val arr: List<Int> = readLine()!!.split(' ').map(String::toInt)
    val bp = arr.sum()/3
    var indexes: String = ""
    var counter = 0
    var is = 0

    for (i in 1..n) {
        counter += arr.get(i-1)
        if (counter == bp) {
            indexes += i.toString() + " "
            counter = 0
            is++
            if (is == 2) break
        }
    }

    if (is != 2) println(-1) else println(indexes)
}