package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
	"strings"
)

func main() {
	sc := bufio.NewScanner(os.Stdin)
	for true && sc.Scan() {
		curr := sc.Text()
		if curr == "0" {
			return
		}

		var a = make([]float64, 5)
		for i, v := range strings.Split(curr, " ") {
			k, _ := strconv.ParseFloat(v, 64)
			a[i] = k
		}

		fmt.Println(math.Pow(math.Pow(math.Abs(a[0]-a[2]), a[4])+math.Pow(math.Abs(a[1]-a[3]), a[4]), 1/a[4]))
	}
}
