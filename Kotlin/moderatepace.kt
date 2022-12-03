fun main() {
    val n = readLine()!!.toInt()
    val t = Triple(readTraining(), readTraining(), readTraining())

    for (i in 0..n-1) {
        print("${listOf(t.first[i], t.second[i], t.third[i]).sorted()[1]} ")
    }
}

fun readTraining() = readLine()!!.split(" ").map(String::toInt)