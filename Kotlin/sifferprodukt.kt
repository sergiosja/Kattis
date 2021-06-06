fun main() {
    val n = readLine()!!
    rec(n)
}

fun rec(n: String) {
    if (n.length == 1) {
        println(n)
        return
    }

    var l: MutableList<Int> = mutableListOf()
    var counter = 0
    var nd = '0'
    for (i in 0..n.length-1) {
        if (n[i] != '0') {
            counter++
            nd = n[i]
            l.add(n[i].toString().toInt())
        }
    }
    
    if (counter == 1) {
        println(nd)
        return
    }

    rec(l.reduce{ a, b -> a * b }.toString())
}