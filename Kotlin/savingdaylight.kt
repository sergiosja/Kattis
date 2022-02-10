fun main() {
    while (true) {
        try {
            val s = readLine()!!.split(" ")

            var time = s[3].split(":")
            var fm = time[0].toDouble() * 60.0 + time[1].toDouble()

            time = s[4].split(":")
            var sm = time[0].toDouble() * 60.0 + time[1].toDouble()

            println("${s[0]} ${s[1]} ${s[2]} ${(Math.floor((sm-fm)/60.0)).toInt()} hours ${((sm-fm) % 60).toInt()} minutes")
        }
        catch (e: Exception) {
            return
        }
    }
}