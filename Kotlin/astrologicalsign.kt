fun main() {
    val n = readLine()!!.toInt()
    val signs = listOf("Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn")
    val months = listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    val days = listOf(21, 20, 21, 21, 21, 22, 23, 23, 22, 23, 23, 22)
    
    for (i in 1..n) {
        val (tmp, m) = readLine()!!.split(' ')
        val d = tmp.toInt()

        for (j in 0..months.size-1) {
            if (m == months[j]) {
                if (d >= days[j]) {
                    println(signs[j])
                } else {
                    if (j > 0) println(signs[j-1]) else println(signs[signs.size-1])
                }
                break
            }
        }
    }
}