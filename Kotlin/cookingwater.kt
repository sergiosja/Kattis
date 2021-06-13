fun main() {
    val n = readLine()!!.toInt()
    val times: MutableList<List<Int>> = mutableListOf()

    for (i in 1..n) {
        times.add(readLine()!!.split(' ').map(String::toInt))
    }

    val a = times.minByOrNull { it -> it[1] }!![1]
    val b = times.maxByOrNull { it -> it[0] }!![0]
    if (a > b) println("edward is right") else println("gunilla has a point")
}