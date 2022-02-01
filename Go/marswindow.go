package main

import "fmt"

func main() {
	var targetYear int
	fmt.Scanln(&targetYear)

	var years [10001]bool
	years[2018] = true

	for currentYear, month, counter := 2018, 3, 0; currentYear <= targetYear; {
		counter++
		month++
		if month == 12 {
			month = 0
			currentYear++
		}
		if counter == 26 {
			years[currentYear] = true
			counter = 0
		}
	}

	if years[targetYear] {
		fmt.Println("yes")
	} else {
		fmt.Println("no")
	}
}
