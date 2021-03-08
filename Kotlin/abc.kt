fun main() {
    val (first, second, third) = readLine()!!.split(' ').map(String::toInt)
    val array = intArrayOf(first, second, third)
    array.sort()

    val map = hashMapOf<Char, Int>()
    map.put('A', array[0])
    map.put('B', array[1])
    map.put('C', array[2])

    val letters = readLine()!!
    val charArray = charArrayOf(letters.get(0), letters.get(1), letters.get(2))
    
    var output: String = ""
    for (i in 0..2) {
        output += map.get(charArray[i])
        output += " "
    }

    println(output)
}