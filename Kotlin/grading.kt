fun main() {
    val grades = readLine()!!.split(' ').map(String::toInt)
    val letters = listOf("A", "B", "C", "D", "E")
    val curr = readLine()!!.toInt()

    for (g in 0..grades.size-1) {
        if (curr >= grades[g]) {
            println(letters[g])
            return
        }
    }
    println("F")
}