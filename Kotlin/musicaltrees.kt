fun main() {
    val (p, _) = readLine()!!.split(' ').map(String::toInt)
    val pl = readLine()!!.split(' ').map(String::toInt).sorted()
    val tl = readLine()!!.split(' ').map(String::toInt).sorted()
    val claimed = mutableSetOf<Int>()

    for (person in pl) {
        var min = Integer.MAX_VALUE
        var curr = 0

        for (tree in tl) {
            val dist = Math.abs(person - tree)

            if (dist < min) {
                min = dist
                curr = tree
            } else {
                break
            }
        }

        claimed.add(curr)
    }

    println(Math.abs(claimed.size-p))
}