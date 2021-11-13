fun main() {
    val (n, k) = readLine()!!.split(' ').map(String::toInt)
    val done = mutableListOf<Boolean>()
    var counter = 0

    for (i in 0..n) {
        done.add(false)
    }

    for (i in 2..n) {
        for (j in i..n step i) {
            if (!done[j]) {
                if (counter == k-1) {
                    print(j)
                    return
                }
                done[j] = true
                counter++
            }
        }
    }
}