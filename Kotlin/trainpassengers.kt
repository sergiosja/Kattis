fun main() {
    val (capacity, stops) = readLine()!!.split(' ').map(String::toInt)
    var curr = 0
    var imp = false

    for (i in 0..stops-1) {
        val (left, entered, waited) = readLine()!!.split(' ').map(String::toInt)
        curr += entered - left

        if (curr > capacity || curr < 0 || (capacity - curr > 0 && waited > 0)) {
            imp = true
            break
        }

        if (i == stops-1 && (waited > 0 || curr > 0) || i == 0 && left > 0) {
            imp = true
            break
        }
    }

    if (imp) println("impossible") else println("possible")
}