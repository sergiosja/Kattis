fun main() {
    readLine()!!
        .lowercase()
        .toCharArray()
        .filter{ it in setOf('a', 'e', 'i', 'o', 'u') }
        .size
        .also(::println)
}