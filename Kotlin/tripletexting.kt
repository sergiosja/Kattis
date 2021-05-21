fun main() {
    val tt: String = readLine()!!
    val check = arrayOf<String>("", "", "")

    for (i in 0..2) {
        check[i] = tt.substring((tt.length/3)*i, (tt.length/3)*(i+1))
    }

    if (check[0] == check[1]) println(check[0]) else println(check[2])
}