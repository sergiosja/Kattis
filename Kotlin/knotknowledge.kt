fun main() {
    readLine()!!
    val tl = readLine()!!.split(' ').toSet()
    val l = readLine()!!.split(' ').toSet()
    for (n in (tl subtract l)) {
        println(n)
    }
}