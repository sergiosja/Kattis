fun main() {
    val (_, c, k) = readLine()!!.split(' ').map(String::toInt)
    val socks = readLine()!!.split(' ').map(String::toInt).sortedBy { it }
    var machines = 1
    var counter = 0

    for (i in 1..socks.size-1) {
        counter++

        if (Math.abs(socks[i-1] - socks[i]) > k) {
            machines++
            counter = 0
        }

        if (counter > 0 && counter % c == 0) {
            machines++
            counter = 0
        }
    }

    println(machines)
}