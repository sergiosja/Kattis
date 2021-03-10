fun main() {
    var score = 1
    println(score)

    while (score < 99) {
        var input = readLine()!!.toInt()

        if (input == 99) {
            return
        }
        else if (input % 3 == 2) {
            score = input+1
        }
        else {
            score = input+2
        }
        println(score)
    }
}