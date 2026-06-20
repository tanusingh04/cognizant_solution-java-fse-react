# Exercise 7: Financial Forecasting Analysis

## 1. Concept of Recursion
Recursion is a programming technique where a method calls itself directly or indirectly to solve a problem. 
- **Structure**: Every recursive method must contain two main parts:
  1. **Base Case**: A terminating condition that stops the recursion and returns a value.
  2. **Recursive Case**: A step that breaks the problem into a smaller sub-problem and calls the method itself.
- **Simplification**: Recursion simplifies complex problems that have a naturally repetitive or nested structure (like directory structure trees, parsing mathematical expressions, or compound mathematical sequences).

---

## 2. Time Complexity of the Recursive Algorithm
In our implementation, the method `calculateFutureValue(PV, r, n)` calls itself once per year:
- **Time Complexity**: \(O(N)\) where \(N\) is the number of years. There are exactly \(N\) function calls made.
- **Space Complexity**: \(O(N)\) auxiliary space. Each recursive call adds a frame to the execution stack. If \(N\) is very large (e.g. daily forecasting over many years), this can result in a `StackOverflowError`.

---

## 3. Optimizations to Avoid Excessive Computation
1. **Iterative Approach (Chosen)**:
   - Converting the recursion to a simple loop reduces space complexity from \(O(N)\) to \(O(1)\) by executing in constant stack space, while maintaining the same \(O(N)\) time complexity.
2. **Memoization / Dynamic Programming**:
   - If the recursive function contains overlapping sub-problems (e.g., Fibonacci series, where the same values are recalculated multiple times), caching the results of previous computations prevents redundant calls, reducing the time complexity from \(O(2^N)\) to \(O(N)\).
3. **Direct Mathematical Formula**:
   - For constant growth, using the closed-form math equation \(PV \times (1 + r)^n\) via `Math.pow(1 + growthRate, years)` executes in \(O(1)\) time.
