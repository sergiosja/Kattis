fun main() {
    var (bridges, knights, group) = readLine()!!.split(' ').map(String::toInt)
    bridges = bridges-1
    var bpd = knights/group
    if (bridges % bpd == 0) println(bridges/bpd) else println((bridges/bpd) +1)
}