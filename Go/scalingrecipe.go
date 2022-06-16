package main

import "fmt"

func main() {
	var n, x, y float64
	fmt.Scanln(&n, &x, &y)

	for i := 0; i < int(n); i++ {
		var r float64
		fmt.Scanln(&r)
		fmt.Println(int(y / x * r))
	}
}
