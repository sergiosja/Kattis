package main

import "fmt"

func main() {
	var s string
	fmt.Scanln(&s)

	atoi := map[string]int{"A": 0, "B": 1, "C": 2, "D": 3, "E": 4, "F": 5, "G": 6, "H": 7, "I": 8, "J": 9, "K": 10, "L": 11, "M": 12,
		"N": 13, "O": 14, "P": 15, "Q": 16, "R": 17, "S": 18, "T": 19, "U": 20, "V": 21, "W": 22, "X": 23, "Y": 24, "Z": 25,
	}

	itoa := map[int]string{0: "A", 1: "B", 2: "C", 3: "D", 4: "E", 5: "F", 6: "G", 7: "H", 8: "I", 9: "J", 10: "K", 11: "L", 12: "M",
		13: "N", 14: "O", 15: "P", 16: "Q", 17: "R", 18: "S", 19: "T", 20: "U", 21: "V", 22: "W", 23: "X", 24: "Y", 25: "Z",
	}

	fmt.Println(merge((rotate(s[:len(s)/2], atoi, itoa)), (rotate(s[len(s)/2:], atoi, itoa)), atoi, itoa))
}

func rotate(s string, atoi map[string]int, itoa map[int]string) string {
	sum := 0
	for _, v := range s {
		sum += atoi[string(v)]
	}

	var news string
	for _, v := range s {
		news += itoa[(atoi[string(v)]+sum)%26]
	}

	return news
}

func merge(s1 string, s2 string, atoi map[string]int, itoa map[int]string) string {
	var s string

	for i := 0; i < len(s1); i++ {
		s += itoa[(atoi[string(s1[i])]+atoi[string(s2[i])])%26]
	}

	return s
}
