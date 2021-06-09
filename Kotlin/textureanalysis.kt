fun main() {
    var a = readLine()!!.split('*')
    var counter = 1

    while (!a.contains("END")) {
        if (a.size < 2) {
            println("$counter++ EVEN")
            continue
        }

        var even = true
        for (i in 2..a.size-2) {
            if (a[i-1].length != a[i].length) {
                println("$counter++ NOT EVEN")
                even = false
                break
            }
        }

        if (even) {
            println("$counter++ EVEN")
        }

        a = readLine()!!.split('*')
    }
}