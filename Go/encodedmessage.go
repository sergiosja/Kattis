package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

func main() {
	var n int
	fmt.Scanln(&n)

	s := bufio.NewScanner(os.Stdin)
	for n > 0 && s.Scan() {
		msg := s.Text()
		k := int(math.Sqrt(float64(len(msg))))
		var dec string

		for j := k - 1; j >= 0; j-- {
			for h := j; h < len(msg); h += k {
				dec += string(msg[h])
			}
		}

		fmt.Println(dec)
		n--
	}
}
