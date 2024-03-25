# Brute Force

## Brute force method
Let’s start off our discussion on algorithms with the most straightforward and exhaustive option—the brute force approach to solving a problem. This method requires us to go through all the possible solutions to the problem we are meaning to solve. For instance, if we have an array of integers and we want to find the minimum, maximum, or a certain element in that array, the brute force approach requires us to go through all the elements to find that specific element. There are no shortcuts and no performance improvements at this stage.

Even though this approach of solving problems is the most inefficient one, it might be the first one that pops into our heads. Also, the good thing about the brute force method is that if a solution to our problem exists, we are guaranteed to find it this way. Once we have a way to go about solving the problem, we can focus on making the solution more efficient.

With this in mind, let’s look at an example to help you visualize this technique.

## Linear search
Linear/Sequential search is a method for finding a target value within a given array. It sequentially checks each element of the array for the target value until a match is found or all the elements have been searched. Linear search runs in linear time (at its worst) and makes n comparisons (at most), where n is the length of the list.

Let’s assume that we are given the following list (array) of unsorted integers.

2 4 6 3 5 7 9 1 8

Now, we can be asked to find a particular element in the array and return its index. That element can be any specific integer value; it can also be the maximum or minimum value present in the array.

Assume we are supposed to find the maximum in an array. This is what our search looks like using a brute force exhaustive search technique:

2 4 6 3 5 7 9 1 8 

max = -1
max_index = 0
index updated to 0 since 2 is the maximum we have seen so far

### Max
```java
class Maximum {
 public static int maximum_index(int array[], int array_size) {
  int max_index = 0; // initialize index to 0
  int max_val = Integer.MIN_VALUE; // set max value to least number
  for (int i = 0; i < array_size; i++) // loop through each element in array
  {
   if (max_val < array[i]) {
    max_val = array[i];
    max_index = i;
   }
  }
  return max_index;
 }
 public static void main(String args[]) {
  int array_size = 9;
  int nums[] = {2,4,6,3,5,7,9,1,8};
  int max_index = maximum_index(nums, array_size);

  System.out.println("The MAX number " + nums[max_index] + " is found at index " + max_index);
 }
}
```

### Find num
```java
class Find {

 public static int find_index(int array[], int to_find, int array_size) // takes an array of integers and an integer to find, then returns index of element if exists otherwise -1
 {
  for (int i = 0; i < array_size; i++) // loop through each element in the array
  {
   if (array[i] == to_find) // check if this is the element you want to find  
   {
    return i; // if found return its index
   }
  }
  return -1; // element not found, return -1
 }

 public static void main(String args[]) {
  int number_to_search = 7;
  int array_size = 9;
  int nums[] = {2,4,6,3,5,7,9,1,8};
  int index_found = find_index(nums, number_to_search, array_size);

  if (index_found != -1)
   System.out.println("The number " + number_to_search + " is found at " + index_found);

  else
   System.out.println("The number " + number_to_search + " is NOT found");
 }
}
```
### Min
```java
class Minimum {
 public static int minimum_index(int array[], int array_size) {
  int min_index = 0; // initialize index to 0
  int min_val = Integer.MAX_VALUE; // set min value to largest number
  for (int i = 0; i < array_size; i++) // loop through each element in array
  {
   if (min_val > array[i]) {
    min_val = array[i];
    min_index = i;
   }
  }
  return min_index;
 }
 public static void main(String args[]) {
  int array_size = 9;
  int nums[] = {2,4,6,3,5,7,9,1,8};
  int min_index = minimum_index(nums, array_size);

  System.out.println("The MIN number " + nums[min_index] + " is found at index " + min_index);
 }
}
```

**Time Complexity:** O(n) - since we’re checking each element exactly once in the worst case.
