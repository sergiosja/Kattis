fun main() {
    val s = readLine()!! + " "

    for (c in 2..s.length-1) {
        if (s[c-2] == ':' || s[c-2] == ';') {
            if ((s[c-1] == '-' && s[c] == ')') || s[c-1] == ')') {
                println(c-2)
            }
        }
    }
}