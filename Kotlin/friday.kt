import java.util.Collections

fun main() {
    val tc = readLine()!!.toInt()

    for (i in 1..tc) {
        val days = listOf(mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>(),
                        mutableListOf<Int>(), mutableListOf<Int>(), mutableListOf<Int>())

        val (_, totMonths) = readLine()!!.split(" ").map(String::toInt)
        val daysInYear = readLine()!!.split(" ").map(String::toInt)

        var currMonth = 0
        var currentWeekday = 0
        while (currMonth < totMonths) {
            var daysInThisMonth = 1

            while (daysInThisMonth <= daysInYear[currMonth]) {
                for (day in currentWeekday..days.size-1) {
                    days[day].add(daysInThisMonth++)

                    if (++currentWeekday > 6) {
                        currentWeekday = 0
                    }

                    if (daysInThisMonth > daysInYear[currMonth]) {
                        break
                    }
                }
            }

            currMonth++
        }

        println(Collections.frequency(days[5], 13))
    }
}