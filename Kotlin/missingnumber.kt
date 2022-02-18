fun main() {
    val exp = fillArray(readLine()!!.toInt())
    val s = "${readLine()!!}00"
    var counter = 0
    var sidec = 0

    if (exp.size == 100 && (s[s.length-5] != '1')) {
        println(100)
        return
    }

    while (counter < s.length) {
        if (counter < 9) {
            if ("${s[counter]}".toInt() != exp[sidec]) {
                println(exp[sidec])
                return
            }
            counter++
            sidec++
            continue
        }

        if ("${s[counter]}${s[counter+1]}".toInt() != exp[sidec]) {
            println(exp[sidec])
            return
        }
        sidec++
        counter += 2
    }
}

fun fillArray(n: Int) = IntArray(n) { it + 1 }