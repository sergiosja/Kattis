fun main() {
    readLine()!!
        .split(" ")
        .map(String::toInt)
        .also { (_, n) -> readLine()!!
            .split(" ")
            .filterIndexed{ i, _ -> (i+1) % n == 0 }
            .joinToString(" ")
            .also(::println) }
}