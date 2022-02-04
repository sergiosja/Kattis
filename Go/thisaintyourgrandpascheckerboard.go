package main

import (
	"fmt"
	"strings"
)

func main() {
	var n int
	fmt.Scanln(&n)

	a := make([][]byte, n)
	t := make([][]byte, n)

	for i := 0; i < n; i++ {
		var b string
		fmt.Scanln(&b)
		a[i] = make([]byte, 0)
		for _, v := range b {
			a[i] = append(a[i], byte(v))
		}
	}

	if checkArray(a, 0, 0) == 0 {
		fmt.Println(0)
		return
	}

	for i := 0; i < n; i++ {
		t[i] = make([]byte, n)
		for j := 0; j < n; j++ {
			t[i][j] = a[j][i]
		}
	}

	fmt.Println(checkArray(t, 0, 0))
}

func checkArray(a [][]byte, bc, wc int) int {
	for i := 0; i < len(a); i++ {
		if strings.Contains(string(a[i]), "WWW") || strings.Contains(string(a[i]), "BBB") {
			return 0
		}

		for j := 0; j < len(a[i]); j++ {
			if a[i][j] == 'W' {
				wc++
			} else {
				bc++
			}
		}
		if wc != bc {
			return 0
		}
	}
	return 1
}
