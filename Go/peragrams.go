package main

import "fmt"

func main() {
	var s string
	fmt.Scanln(&s)

	freq := make(map[rune]int)
	counter := 0

	for _, v := range s {
		if val, ok := freq[v]; ok {
			freq[v] = val + 1
		} else {
			freq[v] = 1
		}
	}

	for _, f := range freq {
		if f%2 != 0 {
			counter++
		}
	}

	if counter == 0 {
		fmt.Println(0)
	} else {
		fmt.Print(counter - 1)
	}
}
