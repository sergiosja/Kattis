fun main() {
    readLine()!!
    val n = readLine()!!.split(' ').map(String::toInt).toMutableList().sorted()
    
    if (n.size < 3) {
        println(n.joinToString(""))
        return
    }
    
    val duplicates: MutableList<Int> = mutableListOf()
    for (i in 2..n.size-1) {
        if (n[i-2] + 1 == n[i-1] && n[i-1] + 1 == n[i]) {
            duplicates.add(n[i-1])
        }
    }
    
    var bn = ""
    for (i in n) {
        if (!duplicates.contains(i)) {
            bn += i.toString() + " "
        } else {
            if (bn[bn.length-1] != '-') {
                bn += "-"
            }
        }
    }

    println(bn.replace(" -", "-"))
}