package main

import "fmt"

func main() {
	var m, a, b, c int
	fmt.Scanln(&m, &a, &b, &c)
	if (a + b + c) <= m*2 {
		fmt.Println("possible")
	} else {
		fmt.Println("impossible")
	}
}
