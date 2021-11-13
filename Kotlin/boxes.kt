fun main() {
    val n = readLine()!!.toInt()
    val tree = mutableListOf<MutableList<Int>>()
    val boxes = readLine()!!.split(' ').map(String::toInt)

    for (i in 0..n) {
        tree.add(mutableListOf<Int>())
    }

    for (i in 0..boxes.size-1) {
        if (boxes[i] > 0) {
            tree[boxes[i]].add(i+1)
        }
    }

    for (i in 1..readLine()!!.toInt()) {
        val tmp = readLine()!!.split(' ').map(String::toInt)
        val queries = tmp.subList(1, tmp.size).toMutableList()
        val visited = mutableSetOf<Int>()

        while (queries.isNotEmpty()) {
            val curr = queries.removeLast()
            visited.add(curr)

            for (b in tree[curr]) {
                if (b !in visited) {
                    queries.add(b)
                }
            }
        }
        println(visited.size)
    }
}