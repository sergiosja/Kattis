fun main() {
    val n = readLine()!!.split(' ').map(String::toInt).sorted()
    val a = n[2] - n[1]
    val b = n[1] - n[0]
    
    if (a == b) println(n[2] + a) else if (a > b) println(n[1] + b) else println(n[0] + a)
}