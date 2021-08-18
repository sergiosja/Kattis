fun main() {
    val k = readLine()!!.toInt()
    val branches = mutableListOf<List<Int>>()

    var tmp = readLine()!!.split(' ').map(String::toInt)
    while (tmp[0] != -1) {
        branches.add(tmp)
        tmp = readLine()!!.split(' ').map(String::toInt)
    }

    println(rec(k, branches, "$k"))
}

fun rec(root: Int, branches: MutableList<List<Int>>, path: String): String {
    for (i in 0..branches.size-1) {
        if (branches[i].contains(root) && branches[i][0] != root) {
            return rec(branches[i][0], branches, "$path ${branches[i][0]}")
        }
    }

    return path
}