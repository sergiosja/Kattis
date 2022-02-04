package main

import (
	"fmt"
)

func main() {
	var p, q, s int
	fmt.Scanln(&p, &q, &s)

	if p*q/gcd(p, q) <= s {
		fmt.Println("yes")
	} else {
		fmt.Println("no")
	}
}

func gcd(a, b int) int {
	for b != 0 {
		tmp := b
		b = a % b
		a = tmp
	}

	return a
}
