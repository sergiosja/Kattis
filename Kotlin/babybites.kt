fun main() {
    readLine()!!
    val s = readLine()!!.split(' ')

    for (i in 1..s.size) {
        if (s[i-1] != i.toString() && s[i-1] != "mumble") {
            println("something is fishy")
            return
        }
    }
    println("makes sense")
}