fun main() {
    val n = readLine()!!.toInt()
    val input = mutableListOf<String>()
    (1..n).forEach{ input.add(readLine()!!) }

    input
        .filter{ it.duplicateCount() == 0 && it.length > 4 }
        .also{ names -> names
        .filter{ it.length == names.minLength() }
        .maxOrNeibb()
        .also(::println)}
    
}

fun String.duplicateCount() =
  this
    .groupingBy { it }
    .eachCount()
    .count { it.value > 1 }


fun List<String>.minLength() =
    this.minByOrNull(String::length)!!.length


fun List<String>.maxOrNeibb() =
    this.maxOrNull() ?: "neibb!"