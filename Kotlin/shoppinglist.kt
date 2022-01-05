// Note: The call to filter on line 12 is a horrible choice when considering complexity, and leads to a TLE error
//       I got this task accepted by using an if-check on line 13. This way we iterate the elements once instead of twice.
//       But I really like the functional look of this code so I have decided to save this version instead, hehe.

fun main() {
    val (n, _) = readLine()!!.split(" ").map(String::toInt)
    val groc = readLine()!!.split(" ").toSet()
    val com = mutableMapOf<String, Int>()

    for (i in 2..n) {
        readLine()!!
            .split(" ")
            .toSet()
            .filter { groc.contains(it) }
            .forEach{ com.put(it, com.getOrElse(it){0}+1) }
    }

    com.filter{ (_, v) -> v == n - 1 }
       .toSortedMap()
       .also{ println(it.size) }
       .forEach{ (k, _) -> println(k) }
}
