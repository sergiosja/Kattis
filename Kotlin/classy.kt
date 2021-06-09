fun main() {
    val t = readLine()!!.toInt()

    for (i in 1..t) {
        val n = readLine()!!.toInt()
        val fam: HashMap<String, String> = hashMapOf()

        for (j in 1..n) {
            val tmp = readLine()!!.split(' ')
            val cls = tmp[1].split('-')
            var clsstr = ""

            for (c in cls) {
                clsstr += if (c == "upper") "a" else if (c == "middle") "b" else "c"
            }

            fam.put(tmp[0].substring(0, tmp[0].length-1), clsstr.reversed() + "b".repeat(10 - clsstr.length))
        }

        fam.map { it.key to it.value }.sortedBy { it.second + it.first }.forEach{ (key, _) -> println(key) }
        println("==============================")
    }
}