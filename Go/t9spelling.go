package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var n int
	fmt.Scanln(&n)
	sc := bufio.NewScanner(os.Stdin)

	t := map[byte]string{'a': "2", 'b': "22", 'c': "222", 'd': "3", 'e': "33", 'f': "333", 'g': "4", 'h': "44",
		'i': "444", 'j': "5", 'k': "55", 'l': "555", 'm': "6", 'n': "66", 'o': "666", 'p': "7", 'q': "77", 'r': "777",
		's': "7777", 't': "8", 'u': "88", 'v': "888", 'w': "9", 'x': "99", 'y': "999", 'z': "9999", ' ': "0"}

	for i := 0; i < n; i++ {
		sc.Scan()
		s := sc.Text()
		tbp := t[s[0]]
		fmt.Print("Case #", i+1, ": ")

		for j := 1; j < len(s); j++ {
			tmp := t[s[j]]
			if tmp[0] == tbp[len(tbp)-1] {
				tbp += " "
			}
			tbp += tmp
		}

		fmt.Println(tbp)
	}
}
