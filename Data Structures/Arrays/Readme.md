### What is an Array?
- This lesson briefly defines arrays, and its types. We will also discuss how arrays are stored in memory.
- We'll cover the following
  - Introduction
  - Array Indexing
  - Types of Arrays
  - One-Dimensional Array
  - Array Declaration
  - Example Program
  - Array Initialization
  - Example program
  - Initialization and Declaration in One Step
  - Example Program
  - Adding or Updating Elements in an Array
  - Example program
  - Adding Elements using Array Literal
  - Example Program
  - How are arrays stored in memory?
- In this lesson, we will revise the basic concepts of Arrays and go through some practical examples to get a grip over this simple yet powerful data structure.
  
Introduction
- An array also referred to as a collection of elements, is the simplest and most widely used Data Structure. Most of the Data Structures (e.g.Stack and Queue) were derived using the Array structure, which is why it is known as one of the central building blocks of Data Structures. These Data Structures will be discussed later in the coming chapters. The purpose of an Array is to group similar kinds of data for fast access.
- Look at the figure below; we have made a simple array with four elements. Each item in the collection is called a Data Element, and the number of data elements stored in an Array is known as its size. You can see that each data element has a maximum of two neighbors, except the first and last one.
  0
  1
  2
  3
  Array of length 4

Array Indexing
- Each data element is assigned a numerical value called the index, which corresponds to the position of that item in the array. It is important to note that the value of the index is non-negative and always starts from zero. So the first element of an array will be stored at index 0 and the last one at index size-1.
- An index makes it possible to access the contents of the array directly. Otherwise, we would have to traverse through the whole array to access a single element. That is the key feature that differentiates Arrays from Linked lists (we will cover them in the next chapter).

Types of Arrays
- Arrays can store primitive data-type values (e.g., int, char, floats, boolean, byte, short, long, etc.), non-primitive data-type values (e.g., Java Objects, etc.) or it can even hold references of other arrays. That divides the arrays into two categories:
  - One Dimensional Array
  - Multi-Dimensional Array

One-Dimensional Array
- The basic syntax for declaring and initializing the one-dimensional array is given below:

Array Declaration
- In the array declaration, reference of an array is created. To declare an array, you have to specify the data type and name of the array.

datatype arrayName[];
or
datatype[] arrayName;

Example Program
  ```java
  class OneDArray {
      public static void main(String args[]) {
          //Declaration Syntax
          int myArray1[];
          int[] myArray2;
      }
  }
  ```

Array Initialization
- Array initialization actually gives memory to the elements of an array. The basic syntax for initializing an array is given below:

arrayName = new type [size];

Example program
  ```java
  class OneDArray {
      public static void main(String args[]) {
          //Declaration Syntax
          int myArray[];
  
          // Initialization Syntax
          myArray = new int [4];
  
          // Accessing elements in an array
          for (int i = 0; i < myArray.length; i++){
  ```

Initialization and Declaration in One Step
- We can also declare and initialize the array in one step.

datatype[] arrayName = new datatype [size];
or
datatype arrayName[] = new datatype [size];

Example Program
  ```java
  class OneDArray {
      public static void main(String args[]) {
          // Initialization and Declaration in one step
          int[] myArray = new int [4];
  
          // Accessing elements in an array
          for (int i = 0; i < myArray.length; i++){
              System.out.println(myArray[i]);
          } 
  ```

Adding or Updating Elements in an Array
- To add or update the element in an array, we specify the particular index and assign the new value.

arrayName[index] = value;

Example program
  ```java
  class OneDArray {
      public static void main(String args[]) {
          // Initialization and Declaration in one step
          int[] myArray = new int [4];
  
          // Adding elements in an array
          myArray[0] = 10;
          myArray[1] = 20;
          myArray[2] = 30;
  ```

Note: Trying to access the element outside the array size will generate an ArrayIndexOutOfBoundsException.

Adding Elements using Array Literal
- If the size and the values of an array are known in advance, we can use the array literal for adding elements in an array.

datatype[] arrayName = {Comma Separated list of values};

Example Program
  ```java
  class OneDArray {
      public static void main(String args[]) {
          // Initialization, Declaration and Adding Elements in one step
          int[] myArray = {10,20,30,40};
  
          // Accessing elements in an array
          for (int i = 0; i < myArray.length; i++){
              System.out.println(myArray[i]);
          }   
  ```

How are arrays stored in memory?
- In Java, arrays are dynamically allocated. Arrays are stored in the memory using a reference pointer, which points to the first element. For example, if we create an array of size 3 and name it myArray, then the variable will point to the start of the array. See the figure below:
  svg viewer
- The only drawback of using arrays is that we have to specify the size of the array during the time of instantiation. That means the size remains fixed and cannot be extended. If we want to add more elements, we will have to create a new array, copy all the items from the old array to the new one, and then insert the new element.
  
