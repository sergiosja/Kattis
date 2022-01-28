package main

import "fmt"

func main() {
	var x, y int
	fmt.Scanln(&x, &y)
	for x != 0 || y != 0 {
		var n int
		fmt.Scanln(&n)
		r, t := make([]int, 2), make([]int, 2)

		for i := 0; i < n; i++ {
			var s string
			var instr int
			fmt.Scanln(&s, &instr)

			switch s {
			case "u":
				t[1] += instr
				r[1] += instr
				if r[1] >= x {
					r[1] = x - 1
				}
			case "d":
				t[1] -= instr
				r[1] -= instr
				if r[1] < 0 {
					r[1] = 0
				}
			case "r":
				t[0] += instr
				r[0] += instr
				if r[0] >= x {
					r[0] = x - 1
				}
			case "l":
				t[0] -= instr
				r[0] -= instr
				if r[0] < 0 {
					r[0] = 0
				}
			}
		}

		fmt.Println("Robot thinks", t[0], t[1], "\nActually at", r[0], r[1], "\n")
		fmt.Scanln(&x, &y)
	}
}
