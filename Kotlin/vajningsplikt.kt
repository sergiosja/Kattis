fun main() {
    val d = readLine()!!.split(' ')
    if (d[0] == "South") {
        row(d, "North", "East", "West")
    }
    else if (d[0] == "East") {
        row(d, "West", "North", "South")
    }
    else if (d[0] == "North") {
        row(d, "South", "West", "East")
    } else {
        row(d, "East", "South", "North")
    }
}

fun row(d: List<String>, a: String, b: String, c: String) {
    if (d[1] == a && d[2] == b) {
        println("Yes")
        return
    }

    if (d[1] == c) {
        if (d[2] == b || d[2] == a) {
            println("Yes")
            return
        }
    }
    println("No")
}