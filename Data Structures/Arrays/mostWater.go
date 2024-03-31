package main


func containerWithMostWater(height []int) int {
	n := len(height)
	l := 0
	r := n-1

	maxNum := 0

	for l<r {
		tmp := 0
		if (height[l]>height[r]){
			tmp = height[r] * (r-l)
			r-=1
		}else{
			tmp = height[l] * (r-l)
			l+=1
		}
		if (maxNum<tmp){
			maxNum = tmp
		}
	}

	return maxNum;
}
