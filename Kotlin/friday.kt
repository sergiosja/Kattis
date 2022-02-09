fun main() {
    val tc = readLine()!!.toInt()

    for (i in 1..tc) {
        val days = listOf(mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>(),
                        mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>())

        val (_, totMonths) = readLine()!!.split(" ").map(String::toInt)
        val daysInYear = readLine()!!.split(" ").map(String::toInt)

        var currentWeekday = 0
        for (currMonth in 0..totMonths-1) {
            var daysInThisMonth = 1

            outer@ while (true) {
                for (day in (currentWeekday % 7)..days.size-1) {
                    days[day].add(daysInThisMonth++)
                    currentWeekday++
                    if (daysInThisMonth > daysInYear[currMonth]) {
                        break@outer
                    }
                }
            }
        }

        println(days[5].count{ it == 13 })
    }
}