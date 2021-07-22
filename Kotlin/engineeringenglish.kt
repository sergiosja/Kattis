fun main() {
    val s = mutableSetOf<String>()

    while (true) {
        try {
            val i = readLine()!!.split(' ')
            var op = ""

            for (w in i) {
                op += if (!s.contains(w.toLowerCase())) w + " " else ". "
                s.add(w.toLowerCase())
            }
            println(op)
        }
        catch (e: Exception) {
            break
        }
    }
}
