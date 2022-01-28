package main

import (
	"fmt"
	"strings"
)

func main() {
	var s string
	fmt.Scanln(&s)

	c := strings.Split(s, "()")
	if len(c[0]) == len(c[1]) {
		fmt.Println("correct")
	} else {
		fmt.Println("fix")
	}
}
