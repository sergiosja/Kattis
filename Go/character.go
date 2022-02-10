package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scanln(&n)

	if n == 0 || n == 1 {
		fmt.Println(0)
	} else if n == 2 {
		fmt.Println(1)
	} else {
		fmt.Println(int(math.Pow(2, float64(n))) - (n + 1))
	}
}
