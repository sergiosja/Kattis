fun main() {
    val cpr = listOf(4, 3, 2, 7, 6, 5, 4, 3, 2, 1)
    readLine()!!
        .split("-")
        .joinToString("")
        .mapIndexed { index, i -> Character.getNumericValue(i) * cpr[index] }
        .sum()
        .also { if (it % 11 == 0) println(1) else println(0) }
}