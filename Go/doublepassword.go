package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b string
	fmt.Scanln(&a)
	fmt.Scanln(&b)

	counter := 0
	for i := 0; i < 4; i++ {
		if a[i] != b[i] {
			counter++
		}
	}
	fmt.Println(math.Floor(math.Pow(2.0, float64(counter))))
}
