fun main() {
    val list = List(1000) { i -> i+1 }
    var right = list.size - 1
    var left = 0

    for (i in 1..10) {
        val middle = (left + right) / 2
        println(middle)
        
        val s = readLine()!!
        if (s == "lower") {
            right = middle - 2
        } else if (s == "higher") {
            left = middle + 2
        } else {
            System.exit(0)
        }
    }
}