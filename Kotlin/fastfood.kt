import java.util.PriorityQueue

fun main() {
    val tc = readLine()!!.toInt()

    for (i in 1..tc) {
        val (n, _) = readLine()!!.split(' ').map(String::toInt)
        val pq = PriorityQueue<Pair<Int, List<Int>>>({a, b -> b.first - a.first})

        for (j in 1..n) {
            val arr = readLine()!!.split(' ').map(String::toInt)
            pq.add(arr[arr.size-1] to arr.subList(1, arr.size-1))
        }

        val t = readLine()!!.split(' ').map(String::toInt).toMutableList()
        var sum = 0

        while (pq.isNotEmpty()) {
            val curr = pq.poll()
            var done = false

            while (!done) {
                for (c in curr.second) {
                    if (t[c-1]-- == 0) {
                        sum -= curr.first
                        done = true
                        break
                    }
                }
                sum += curr.first
            }
        }

        println(sum)
    }
}