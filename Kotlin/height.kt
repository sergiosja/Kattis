fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val arr = readLine()!!.split(' ').map(String::toInt).toMutableList()
        var counter = 0
        arr.add(Int.MAX_VALUE)

        for (j in 0..arr.size-1) {
            for (k in 1..arr.size-2) {
                if (arr[k] > arr[k+1]) {
                    val tmp = arr[k]
                    arr[k] = arr[k+1]
                    arr[k+1] = tmp
                    counter++
                }
            }
        }
        println("$i $counter")
    }
}