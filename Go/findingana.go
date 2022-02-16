package main

import (
	"fmt"
)

func main() {
	var s string
	fmt.Scanln(&s)

	for i, v := range s {
		if v == 'a' {
			fmt.Println(s[i:])
			return
		}
	}
}
