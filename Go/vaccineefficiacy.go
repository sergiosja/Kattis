package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	vacc := [4]float64{0.0, 0.0, 0.0, 0.0}
	con := [4]float64{0.0, 0.0, 0.0, 0.0}
	str := map[string]*[4]float64{"Y": &vacc, "N": &con}

	for i := 0; i < n; i++ {
		var s string
		fmt.Scanln(&s)

		curr := str[string(s[0])]
		curr[0]++
		for j := 1; j < 4; j++ {
			if string(s[j]) == "Y" {
				curr[j]++
			}
		}
	}

	for i := 1; i < 4; i++ {
		a := vacc[i] / vacc[0] * 100.0
		b := con[i] / con[0] * 100.0

		if a >= b {
			fmt.Println("Not Effective")
		} else {
			fmt.Println(100.0 - a/b*100.0)
		}
	}
}
