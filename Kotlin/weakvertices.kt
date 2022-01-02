fun main() {
    while (true) {
        val n = readLine()!!.toInt()
        val graph = mutableListOf<List<Int>>()
        val strong = mutableSetOf<Int>()

        if (n == -1) {
            break
        }

        for (i in 1..n) {
            graph.add(readLine()!!.split(' ').map(String::toInt))
        }

        for (i in 0..n-1) {
            for (j in 0..n-1) {
                for (k in 0..n-1) {
                    if (graph[i][j] == 1 && graph[j][k] == 1 && graph[k][i] == 1) {
                        strong.add(i)
                        break
                    }
                }
            }
        }

        for (i in 0..n-1) {
            if (i !in strong) {
                print("$i ")
            }
        }
    }
}
