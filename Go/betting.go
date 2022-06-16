package main

import "fmt"

// Note: Input description states that n can be 0, but
// there are no guidelines for how to handle cases where
// division by 0 occur. Therefore assumed that n > 0
// always holds.

func main() {
	var n float64
	fmt.Scanln(&n)
	fmt.Println(100 / n)
	fmt.Println(100 / (100 - n))
}
