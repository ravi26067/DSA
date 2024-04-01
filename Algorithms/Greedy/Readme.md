# Greedy Algorithms

## Greedy algorithms

Greedy is an algorithmic paradigm that builds up a solution piece by piece; this means it chooses the next piece that offers the most obvious and immediate benefit. A greedy algorithm, as the name implies, always makes the choice that seems to be the best at the time. It makes a locally-optimal choice in the hope that it will lead to a globally optimal solution.

The problems where the locally-optimal choice leads to a global solution are the best fit for the Greedy technique.

The greedy method can optimally solve a problem that satisfies the below-mentioned properties:

- Greedy choice property: A global optimum can be arrived at by selecting a local optimum.
- Optimal substructure: An optimal solution to the problem contains an optimal solution to subproblems.

Greedy algorithms work by recursively constructing a set of pieces from the smallest possible constituent parts. Recursion is an approach to problem-solving in which the solution to a particular problem depends on solutions to smaller instances of the same problem.

![Greedy search path example](https://upload.wikimedia.org/wikipedia/commons/8/8c/Greedy-search-path-example.gif)

Looking at the animation above, it is trying to find the path with the maximum sum of node values. We can see that the greedy algorithm just grabs the solution it thinks is best—without looking at its consequences. It might work in some cases, especially those where the optimal solution of the subset is the solution for the superset as well.

The advantage of using a greedy algorithm is that solutions to smaller instances of the problem can be straightforward and easy to understand. However, the disadvantage is that it is entirely possible that the most optimal short-term solutions may lead to the worst possible long-term outcome!!


## Applications

1. Activity Selection Problem
2. Huffman Coding
3. Job Sequencing Problem
4. Fractional Knapsack Problem
5. Prim's Minimum Spanning tree 
