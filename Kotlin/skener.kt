fun main() {
    val (r, _, zr, zc) = readLine()!!.split(' ').map(String::toInt)

    for (i in 1..r) {
        val s = readLine()!!
        
        for (j in 1..zr) {
            var skener = ""
            for (k in s) {
                skener += k.toString().repeat(zc)
            }
            
            println(skener)
        }
    }
}