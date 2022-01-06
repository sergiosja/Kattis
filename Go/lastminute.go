package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b, c, d int
	fmt.Scanln(&a, &b, &c, &d)

	if a+c == 0 || b+d == 0 {
		fmt.Println(0)
	} else if a != 0 && b != 0 && c != 0 && d != 0 {
		fmt.Println(a + b + c*d)
	} else if c == 0 && d == 0 {
		fmt.Println(int(math.Min(float64(a), float64(b))))
	} else if c != 0 {
		fmt.Println(c*d + b)
	} else {
		fmt.Println(d*c + a)
	}
}
