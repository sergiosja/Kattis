fun main() {
    val (n, s) = readLine()!!.split(" ").map(String::toInt)
    var tot = 0
    var curr = s
    
    for (i in 0..n-1) {
        val c = readLine()!!
        val k = if (c.endsWith("L")) c.dropLast(1).toInt() + 1 else c.toInt()
        if (curr - k < 0) {
            tot++
            curr = s
        }
        curr -= k
    }

    println(tot)
}