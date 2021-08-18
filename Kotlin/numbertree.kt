fun main() {
    val dir = readLine()!!.split(' ')
    val root = Math.pow(2.0, dir[0].toDouble() + 1.0).toInt() - 1
    var node = 0

    if (dir.size == 1) {
        println(root)
        return
    }

    for (c in dir[1]) {
        node *= 2
        node += if (c == 'L') 1 else 2
    }

    println(root - node)
}