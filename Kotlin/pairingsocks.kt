fun main() {
    readLine()!!
    val org = readLine()!!.split(' ').map(String::toInt).toMutableList()
    val aux = mutableListOf<Int>()
    var moves = 0

    while (org.isNotEmpty()) {
        if (aux.isNotEmpty() && aux.get(aux.size-1) == org.get(org.size-1)) {
            aux.removeAt(aux.size-1)
            org.removeAt(org.size-1)
        } else {
            aux.add(org.removeAt(org.size-1))
        }

        moves++
    }

    if (aux.isNotEmpty()) println("impossible") else println(moves)
}