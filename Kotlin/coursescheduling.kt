fun main() {
    val n = readLine()!!.toInt()
    val courses = mutableSetOf<List<String>>()
    
    for (i in 1..n) {
        courses.add(readLine()!!.split(' '))
    }
    
    val occurrences = hashMapOf<String, Int>()
    
    for (i in courses) {
        val course = i[i.size-1]
        occurrences.put(course, occurrences.getOrElse(course){0} + 1)
    }
    
    var collection = mutableListOf<Pair<String, Int>>()

    for (i in occurrences) {
        collection.add(i.key to i.value)
    }

    collection.sortedWith(compareBy({ it.first }, { it.second }))
              .toMutableList()
              .forEach { println("${it.first} ${it.second}") }
}