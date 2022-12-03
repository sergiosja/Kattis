package main

import "fmt"

func main() {
	var n int
	var s string
	fmt.Scanln(&n)
	fmt.Scanln(&s)

	counter := 0
	streak := 0
	for _, char := range s {
		if string(char) == "1" {
			streak = 2
			counter++
		} else if streak > 0 {
			counter++
			streak--
		}
	}
	fmt.Println(counter)
}
