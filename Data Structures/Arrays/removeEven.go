package main

import "fmt"


func removeEven(arr[] int) []int{
	var result int

	for _,ele := range arr{
		if ele%2!=0 {
			result = append(result,ele)
		}
	}
	return result
}

func main(){
	arr:=[]int{1,2,3,4,5,6,7,8}
	newArr := removeEven(arr)
	fmt.Println(newArr)

}
