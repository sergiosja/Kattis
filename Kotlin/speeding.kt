fun main() {
    val n = readLine()!!.toInt()
    val mph = mutableListOf<Int>()
    val hours = mutableListOf<Int>()
    val distances = mutableListOf<Int>()

    for (i in 0..n-1) {
        var (t, d) = readLine()!!.split(' ').map(String::toInt)
        distances.add(d)
        hours.add(t)

        if (i == 0) {
            mph.add(i)
        }
        else {
            t -= hours[i-1]
            d -= distances[i-1]
            mph.add(d/t)
        }
    }

    println(mph.max())
}