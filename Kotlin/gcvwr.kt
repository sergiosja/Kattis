fun main() {
    readLine()!!
        .split(" ")
        .map(String::toInt)
        .also{ (m, n, _) -> readLine()!!
            .split(" ")
            .map(String::toInt)
            .sum()
            .also{ println((m - n) * 90 / 100 - it) }}
}