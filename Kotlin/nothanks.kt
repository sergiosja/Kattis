fun main() {
    readLine()!!
    val cards = readLine()!!.split(" ").map(String::toInt).sorted()
    var sum = cards[0]
    for (i in cards.size-1 downTo 1) {
        if (cards[i] > (cards[i-1]+1)) {
            sum += cards[i]
        }
    }

    println(sum)
}