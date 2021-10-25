fun main() {
    var n = readLine()!!.toInt()
    val q = mutableListOf<String>()

    for (i in 1..n) {
        q.add(readLine()!!)
    }

    n = readLine()!!.toInt()
    for (i in 1..n) {
        val cmd = readLine()!!.split(' ')
        if (cmd[0] == "leave") {
            q.remove(cmd[1])
        } else {
            q.add(q.indexOf(cmd[2]), cmd[1])
        }
    }

    q.forEach {
        println(it)
    }
}