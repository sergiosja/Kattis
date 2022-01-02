package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var p int
	timer := 230
	fmt.Scanln(&p)

	sc := bufio.NewScanner(os.Stdin)
	sc.Scan()

	for true && sc.Scan() {
		curr := strings.Split(sc.Text(), " ")
		tmp, _ := strconv.Atoi(curr[0])
		timer -= tmp

		if timer <= 0 {
			fmt.Println(p)
			return
		} else if curr[1] == "T" {
			if p == 8 {
				p = 1
			} else {
				p++
			}
		}
	}
}
