# Two Pointers: Introduction

Let’s go over the Two Pointers pattern, its real-world applications, and some problems we can solve with it.

## Table of Contents
- [Overview](#overview)
- [Examples](#examples)
- [Does my problem match this pattern?](#does-my-problem-match-this-pattern)
- [Real-world problems](#real-world-problems)
- [Strategy time!](#strategy-time)

## Overview
As the name suggests, the two pointers pattern uses two pointers to iterate over an array or list until the conditions of the problem are satisfied. This is useful because it allows us to keep track of the values of two different indexes in a single iteration. Whenever there’s a requirement to find two data elements in an array that satisfy a certain condition, the two pointers pattern should be the first strategy to come to mind.

The pointers can be used to iterate the data structure in one or both directions, depending on the problem statement. For example, to identify whether a string is a palindrome, we can use one pointer to iterate the string from the beginning and the other to iterate it from the end. At each step, we can compare the values of the two pointers and see if they meet the palindrome properties.

The naive approach to solving this problem would be using nested loops, with a time complexity of O(n^2). However, by using two pointers moving towards the middle from either end, we exploit the symmetry property of palindromic strings. This allows us to compare the elements in a single loop, making the algorithm more efficient with a time complexity of O(n).

Here’s how the pointers will move along the string:

<img width="889" alt="image" src="https://github.com/ravi26067/DSA/assets/17096338/eeb8bad5-c3f3-4115-a092-4555ae778803">
<img width="888" alt="image" src="https://github.com/ravi26067/DSA/assets/17096338/33ad5b32-ed94-46f8-b5db-99050f559494">
<img width="889" alt="image" src="https://github.com/ravi26067/DSA/assets/17096338/6494a96f-d504-4504-906f-778d97d3b8f6">

Essentially, the two pointers pattern is an application of the prune-and-search strategy, in which, at every step, we’re able to safely prune—that is, eliminate—a set of possible solutions.

## Examples
The following examples illustrate some problems that can be solved with this approach:

<img width="889" alt="image" src="https://github.com/ravi26067/DSA/assets/17096338/e0ef772e-2cb8-40cd-9c3f-7b52b85f3c35">


<img width="889" alt="image" src="https://github.com/ravi26067/DSA/assets/17096338/91c46575-1a00-43f4-8685-f543b5c5dc49">

## Does my problem match this pattern?
Yes, if all of these conditions are fulfilled:
- The input data can be traversed in a linear fashion, that is, it’s in an array, in a linked list, or in a string of characters.
- We limit our focus to a specific range of elements within the input data, as dictated by the positions of the two pointers, allowing us to consider a small subset of elements rather than the entire set.
- Additionally, problems in this pattern usually involve comparing or swapping values pointed to by two indexes. In less common cases, each index may move along a separate array or string.

No, if either of these conditions is fulfilled:
- The input data cannot be traversed in a linear fashion, that is, it’s neither in an array, nor in a linked list, nor in a string of characters.
- The problem requires an exhaustive search of the solution space, that is, eliminating one solution does not eliminate any others.

## Real-world problems
Many problems in the real world use the two pointers pattern. Let’s look at some examples:
- **Memory management**: Two pointers are vital in memory allocation and deallocation. The memory pool is initialized with two pointers: the start pointer, pointing to the beginning of the available memory block, and the end pointer, indicating the end of the block. When a process or data structure requests memory allocation, the start pointer is moved forward, designating a new memory block for allocation. Conversely, when memory is released (deallocated), the start pointer is shifted backward, marking the deallocated memory as available for future allocations.
- **Product suggestions**: While shopping online, when customers view their cart and the current total doesn’t qualify for free shipping, we want to show them pairs of products that can be bought together to make the total amount equal to the amount required to be eligible for free delivery. Two pointers can be used to suggest the pairs that add up to the required cost for free shipping.
