fun main() {
    var word: MutableSet<Char> = readLine()!!.toCharArray().toMutableSet()
    val guess = readLine()!!.toCharArray()
    var wrong = 0

    for (i in 0..guess.size-1) {
        if (word.contains(guess[i])) {
            word = word.filter{ it != guess[i] }.toMutableSet()
        } else {
            wrong++
        }

        if (word.isEmpty()) {
            println("WIN")
            return
        }

        if (wrong == 10) {
            println("LOSE")
            return
        }
    }
}