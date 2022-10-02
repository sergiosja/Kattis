package main

import "fmt"

/* go run library.go test.go */
func main() {
	var n int
	fmt.Scanln(&n)
	if sumInts(readIntArray(n))%3 == 0 {
		fmt.Println("yes")
	} else {
		fmt.Println("no")
	}
}
