import java.io.EOFException

fun main() {
    val h = mutableMapOf<Char, Int>('&' to 24, ',' to 7, '2' to 22,
    '8' to 23, '>' to 10, 'D' to 26, 'J' to 18, 'P' to 23, 'V' to 19,
    '\\' to 10, 'b' to 25, 'h' to 21, 'n' to 18, 't' to 17, 'z' to 19,
    '!' to 9, '\'' to 3, '-' to 7, '3' to 23, '9' to 26, '?' to 15,
    'E' to 26, 'K' to 21, 'Q' to 31, 'W' to 26, ']' to 18, 'c' to 17,
    'i' to 15, 'o' to 20, 'u' to 17, '{' to 18, '\"' to 6, '(' to 12,
    '.' to 4, '4' to 21, ':' to 8, '@' to 32, 'F' to 20, 'L' to 16, 'R' to 28,
    'X' to 18, '^' to 7, 'd' to 25, 'j' to 20, 'p' to 25, 'v' to 13, '|' to 12,
    '#' to 24, ')' to 12, '/' to 10, '5' to 27, ';' to 11, 'A' to 24, 'G' to 25,
    'M' to 28, 'S' to 25, 'Y' to 14, '_' to 8, 'e' to 23, 'k' to 21, 'q' to 25,
    'w' to 19, '}' to 18, '$' to 29, '*' to 17, '0' to 22, '6' to 26, '<' to 10,
    'B' to 29, 'H' to 25, 'N' to 25, 'T' to 16, 'Z' to 22, '`' to 3, 'f' to 18,
    'l' to 16, 'r' to 13, 'x' to 13, '~' to 9, '%' to 22, '+' to 13, '1' to 19,
    '7' to 16, '=' to 14, 'C' to 20, 'I' to 18, 'O' to 26, 'U' to 23, '[' to 18,
    'a' to 23, 'g' to 30, 'm' to 22, 's' to 21, 'y' to 24)

    while (true) {
        try {
            val s = readLine()!!
            var sum = 0

            for (c in s) {
                sum += h.getOrElse(c){0}
            }

            println(sum)
        }
        catch (e: Exception) {
            break
        }
    }
}