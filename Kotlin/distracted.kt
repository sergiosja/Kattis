fun main() {
    val (n, l) = readLine()!!.split(' ').map(String::toInt)
    val status = mutableMapOf<String, Char>()
    var sum = 0
    var q = false

    for (i in 1..n) {
        val tmp = readLine()!!.split(' ')
        status.put(tmp[0], tmp[1][0])
    }

    for (i in 1..l) {
        val s = readLine()!!.split(' ')

        if (s[0] == "->") {
            if (status.get(s[0]) == 'm' && status.get(s[2]) == 'u') {
                sum++
            }
            
            if (status.get(s[0]) == 'm' && status.get(s[2]) == '?') {
                q = true
            }
            else if (status.get(s[0]) == '?' && status.get(s[2]) == 'u') {
                q = true
            }
        }
    }

    if (!q || (q && sum > 0)) println(sum) else println('?')
}