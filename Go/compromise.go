package main

import (
	"fmt"
	"strconv"
)

func main() {
	var t int
	fmt.Scanln(&t)

	for i := 0; i < t; i++ {
		var n, m int
		fmt.Scanln(&n, &m)
		bits := make([]string, 0)

		for j := 0; j < n; j++ {
			var b string
			fmt.Scanln(&b)
			bits = append(bits, b)
		}

		counter := make([]int, m)
		for _, v := range bits {
			for index, v2 := range v {
				x, _ := strconv.Atoi(string(v2))
				counter[index] += x
			}
		}

		s := ""
		for j := 0; j < m; j++ {
			if counter[j] > (n / 2) {
				s += "1"
			} else {
				s += "0"
			}
		}

		fmt.Println(s)
	}
}
