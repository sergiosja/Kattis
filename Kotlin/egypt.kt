fun main() {
    var a = readLine()!!.split(' ').map(String::toDouble)
    
    while (!a.contains(0.0)) {
        if (pow(a[0], a[1], a[2]) || pow(a[1], a[2], a[0]) || pow(a[2], a[0], a[1])) {
            println("right")
        } else {
            println("wrong")
        }

        a = readLine()!!.split(' ').map(String::toDouble)
    }
}

fun pow(a: Double, b: Double, c: Double): Boolean = Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0)