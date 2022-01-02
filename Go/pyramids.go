package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scanln(&n)

	p := make([]int, n)
	p[0] = 0

	for i := 1; i < n; i++ {
		p[i] = p[i-1] + int(math.Pow(float64(i*2-1), 2))

		if p[i] > n {
			fmt.Println(i - 1)
			return
		}
	}
}
