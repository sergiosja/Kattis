fun main() {
    while (true) {
        try {
            val n = readLine()!!.split(' ').map(String::toInt)
            for (i in n) {
                if (n.sum() - i == i) {
                    println(i)
                    break
                }
            }
        }
        catch (e: Exception) {
            break
        }
    }
}