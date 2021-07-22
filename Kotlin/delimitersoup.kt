fun main() {
    readLine()!!
    val s = readLine()!!
    val b = listOf('{', '[', '(', '}', ']', ')')
    val p = mutableListOf<Char>('.')

    for (c in 0..s.length-1) {
        for (i in 0..2) {
            if (s[c] == b[i]) {
                p.add(s[c])
                continue
            }

            if (s[c] == b[i+3]) {
                if (p[p.size-1] != b[i]) {
                    println("${s[c]} $c")
                    return
                }
                p.removeAt(p.size-1)
            }
        }
    }
    println("ok so far")
}