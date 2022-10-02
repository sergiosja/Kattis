package main

import "fmt"

/* go run library.go test.go */
func main() {
	var n int
	fmt.Scanln(&n)

	var a = make([]int, n)
	for i := range a {
		var m int
		fmt.Scanln(&m)
		a[i] = m
	}

	counter := 1
	for i := 1; i < len(a); i++ {
		if a[i-1] > a[i] {
			counter++
		}
	}
	fmt.Println(counter)
}
