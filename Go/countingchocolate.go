package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var n int
	fmt.Scanln(&n)

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	s := scanner.Text()

	var arr = make([]int, n)
	for i, v := range strings.Split(s, " ") {
		k, _ := strconv.Atoi(v)
		arr[i] = k
	}

	if count(arr, len(arr)) {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}

func count(arr []int, n int) bool {
	s := 0
	for _, v := range arr {
		s += v
	}

	if s%2 != 0 {
		return false
	}

	var choc = make([]bool, s/2+1)

	for i := 0; i < n; i++ {
		for j := s / 2; j > arr[i]-1; j-- {
			if choc[j-arr[i]] || j == arr[i] {
				choc[j] = true
			}
		}
	}

	return choc[s/2]
}
