package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scanln(&n)

	for i := 0; i < n; i++ {
		if adventure(map[byte]byte{'b': '$', 't': '|', 'j': '*'}, make([]byte, 0)) == 0 {
			fmt.Println("YES")
		} else {
			fmt.Println("NO")
		}
	}
}

func adventure(v map[byte]byte, bp []byte) int {
	e := byte('k')

	var s string
	fmt.Scanln(&s)

	for c := 0; c < len(s); c++ {
		if s[c] != '.' {
			if p, ok := v[s[c]]; ok {
				if len(bp) == 0 {
					return -1
				}
				if bp, e = pop(bp); e != p {
					return -1
				}
			} else {
				bp = append(bp, s[c])
			}
		}
	}

	return len(bp)
}

func pop(l []byte) ([]byte, byte) {
	return l[:len(l)-1], l[len(l)-1]
}
