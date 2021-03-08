import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var (h, w, b) = readLine()!!.split(' ').map(String::toInt)
    var totH: Int = 0; var totW: Int = 0

    while (b-- > 0 && totH <= h && totW <= w) {
        totW += sc.nextInt()
        if (totW == w) {
            totW = 0
            totH++
        }
        if (totH == h) break;
    }

    if (totH == h) println("YES") else println("NO")
}