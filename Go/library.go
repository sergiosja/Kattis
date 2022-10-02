package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

/* Reverses an int array */
func reverseIntArray(a []int64) []int64 {
	for i, j := 0, len(a)-1; i < j; i, j = i+1, j-1 {
		a[i], a[j] = a[j], a[i]
	}
	return a
}

/* Reverses a float array */
func reverseFloatArray(a []float64) []float64 {
	for i, j := 0, len(a)-1; i < j; i, j = i+1, j-1 {
		a[i], a[j] = a[j], a[i]
	}
	return a
}

/* Reverses a string array */
func reverseStringArray(a []string) []string {
	for i, j := 0, len(a)-1; i < j; i, j = i+1, j-1 {
		a[i], a[j] = a[j], a[i]
	}
	return a
}

/* Finds median amongst a variadic number of ints */
func medianInts(n int64, nums ...int64) int64 {
	var a = make([]int64, n)
	for i, v := range nums {
		a[i] = v
	}
	sort.Slice(a, func(i, j int) bool { return a[i] < a[j] })
	return a[len(a)/2]
}

/* Finds median amongst a variadic number of floats */
func medianFloats(n int64, nums ...float64) float64 {
	var a = make([]float64, n)
	for i, v := range nums {
		a[i] = v
	}
	sort.Slice(a, func(i, j int) bool { return a[i] < a[j] })
	return a[len(a)/2]
}

/* Gets sum of elements in int64 array */
func sumInts(a []int64) int64 {
	sum := int64(0)
	for _, v := range a {
		sum += v
	}
	return sum
}

/* Gets sum of elements in float64 array */
func sumFloats(a []float64) float64 {
	sum := 0.0
	for _, v := range a {
		sum += v
	}
	return sum
}

/* Reads input and converts to int64 array */
func readIntArray(limit int) []int64 {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	curr := scanner.Text()

	var intArray = make([]int64, limit)
	for index, value := range strings.Split(curr, " ") {
		convertedInt, _ := strconv.ParseInt(value, 10, 0)
		intArray[index] = convertedInt
	}

	return intArray
}

/* Reads input and converts to float64 array */
func readFloatArray(limit int) []float64 {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	curr := scanner.Text()

	var floatArray = make([]float64, limit)
	for index, value := range strings.Split(curr, " ") {
		convertedFloat, _ := strconv.ParseFloat(value, 64)
		floatArray[index] = convertedFloat
	}

	return floatArray
}

/* Reads input and converts to string array */
func readStringArray(limit int) []string {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	curr := scanner.Text()

	var stringArray = make([]string, limit)
	for index, value := range strings.Split(curr, " ") {
		stringArray[index] = value
	}

	return stringArray
}

/* yeah... */
func thisIsOnlyHereSoThatICanImportTheFmtPackage() {
	fmt.Println("This is only here so that I can import the fmt package for testing etc.")
}
