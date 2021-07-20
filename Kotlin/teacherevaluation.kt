fun main() {
    val (_, r) = readLine()!!.split(' ').map(String::toInt)
    val scores = readLine()!!.split(' ').map(String::toInt).toMutableList()

    if (r == 100 && scores.sum() != 100 || r == 0 && scores.sum() != 0) {
        println("impossible")
        return
    }

    var ex = 0
    while (scores.sum() / scores.size < r) {
        ex++
        scores.add(100)
    }

    println(ex)
}