package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	fibs := [1000]int{1, 1}

	for i := 0; i < n; i++ {
		var m int
		fmt.Scanln(&m)

		var ns [1000]int
		for j := range ns {
			ns[j] = -1
		}

		for j := 2; ; j++ {
			fibs[j] = (fibs[j-1]%m + fibs[j-2]%m) % m

			if ns[fibs[j]] == -1 {
				ns[fibs[j]] = j
			} else {
				fmt.Println(ns[fibs[j]])
				break
			}
		}
	}
}
