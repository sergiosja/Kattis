fun main() {
    val (wc, hc, ws, hs) = readLine()!!.split(' ').map(String::toInt)    
    if (wc - 1 > ws && hc - 1 > hs) println(1) else println(0)
}