package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	var s string
	fmt.Scanln(&n)
	fmt.Scanln(&s)

	seqs := [][]string{{"A", "B", "C"}, {"B", "A", "B", "C"}, {"C", "C", "A", "A", "B", "B"}}
	boys := [3]string{"Adrian", "Bruno", "Goran"}
	sums := [3]int{0, 0, 0}

	for i := 0; i < n; i++ {
		for j, v := range seqs {
			if string(s[i]) == string(v[i%len(v)]) {
				sums[j]++
			}
		}
	}

	tot := int(math.Max(math.Max(float64(sums[0]), float64(sums[1])), float64(sums[2])))
	fmt.Println(tot)

	for i, v := range sums {
		if v == tot {
			fmt.Println(boys[i])
		}
	}
}
