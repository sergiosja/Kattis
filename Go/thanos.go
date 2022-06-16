package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)
	for i := 0; i < n; i++ {
		var a, b, c int
		fmt.Scanln(&a, &b, &c)
		counter := 0
		for a <= c {
			a *= b
			counter++
		}
		fmt.Println(counter)
	}
}
