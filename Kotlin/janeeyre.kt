import java.util.PriorityQueue

fun main() {
    val (n, m, j) = readLine()!!.split(' ').map(String::toInt)
    val curr = PriorityQueue<Pair<String, Int>>(compareBy { it.first })
    curr.add("Jane Eyre" to j)
    var gifts = mutableListOf<Triple<Int, String, Int>>()
    var time: Long = 0

    for (i in 1..n) {
        val tmp = readLine()!!.split("\"")
        curr.add(tmp[1] to tmp[2].substring(1).toInt())
    }
    
    for (i in 1..m) {
        val tmp = readLine()!!.split("\"")
        gifts.add(Triple(tmp[0].substring(0, tmp[0].length-1).toInt(), tmp[1], tmp[2].substring(1).toInt()))
    }

    gifts = gifts.sortedWith(compareBy({ it.first }, { it.second })).toMutableList()
    var i = 0

    while (true) {
        while (i < gifts.size && gifts[i].first <= time) {
            curr.add(gifts[i].second to gifts[i].third)
            i++
        }

        val x = curr.poll()
        time += x.second        
        if (x.first == "Jane Eyre") {
            break
        }
    }

    println(time)
}