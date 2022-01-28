package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	for n > 0 {
		var c int
		fmt.Scanln(&c)
		n--

		for n > 0 {
			var k int
			fmt.Scanln(&k)
			n--

			if k%c == 0 {
				fmt.Println(k)
				break
			}
		}
	}
}
