package main

import (
	"fmt"
	"math"
)

func main() {
	var m, n int
	fmt.Scanln(&m, &n)

	if float64(m) > math.Sqrt(2)*float64(n) {
		fmt.Println("nope")
	} else {
		fmt.Println("fits")
	}
}
