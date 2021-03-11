fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    val cases: MutableList<Int> = mutableListOf()
    
    for (i in a..b) {
        val str = i.toString().toCharArray()
        val value = str.map(Character::getNumericValue).sum()
        if (value == c) {
            cases.add(i)
        }
    }

    println(cases.minOrNull())
    println(cases.maxOrNull())
}