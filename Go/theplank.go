package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	// The first first 3 are trivial and 4 is given in the problem desc.
	a := [25]int{0, 1, 2, 4, 7}

	for i := 5; i <= n; i++ {
		a[i] = a[i-1] + a[i-2] + a[i-3]
	}

	fmt.Println(a[n])
}

// To achieve the record runtime of 0.02s, I used this function.
// Since input is limited to 1 <= n <= 24, I could easily run the above
// loop to find the necessary values, and before passing this O(1) solution.
func o1(n int) {
	m := map[int]int{1: 1, 2: 2, 3: 4, 4: 7, 5: 13, 6: 24, 7: 44, 8: 81,
		9: 149, 10: 274, 11: 504, 12: 927, 13: 1705, 14: 3136, 15: 5768,
		16: 10609, 17: 19513, 18: 35890, 19: 66012, 20: 121415,
		21: 223317, 22: 410744, 23: 755476, 24: 1389537}

	fmt.Println(m[n])
}
