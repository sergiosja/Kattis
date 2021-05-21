fun main() {
    val (l, h) = readLine()!!.split(' ')
    var tot = 0
    for (i in l.toInt()..h.toInt()) {

        if (i.toString().toCharArray().size == i.toString().toSet().size) {
            val tmp2 = i.toString().toCharArray()

            if (tmp2.contains('0')) {
                continue
            }
            
            var bool = true
            for (j in 0..tmp2.size-1) {
                if (i % Character.getNumericValue(tmp2[j]) != 0) {
                    bool = false
                }
            }

            if (bool) {
                tot++
            }
        }
    }
    
    println(tot)
}