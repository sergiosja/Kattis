package main

import (
	"bufio"
	"os"
	"strconv"
	"strings"
)

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
