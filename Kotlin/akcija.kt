fun main() {
    val n = readLine()!!.toInt()
    val books = mutableListOf<Int>()

    for (i in 1..n)
        books.add(readLine()!!.toInt())

    books
        .sortedByDescending{ it }
        .filterIndexed { index, _ -> (index + 1) % 3 != 0 }
        .sum()
        .also{ println(it) }
}
