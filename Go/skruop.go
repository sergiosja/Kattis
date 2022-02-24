package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scanln(&n)
	volume := 7

	for i := 0; i < n; i++ {
		var a, b string
		fmt.Scanln(&a, &b)
		if (b == "op!") && (volume < 10) {
			volume++
		} else if (b == "ned!") && (volume > 0) {
			volume--
		}
	}

	fmt.Println(volume)
}
