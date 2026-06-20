# Exercise 3: Sorting Customer Orders Analysis

## 1. Explanation of Sorting Algorithms
- **Bubble Sort**: A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This pass-through is repeated until no swaps are needed.
- **Insertion Sort**: Builds the final sorted array one item at a time. It takes each element from the input and inserts it into its correct position in the already-sorted part of the array.
- **Quick Sort**: A divide-and-conquer algorithm. It picks an element as a pivot and partitions the array around the pivot, such that elements smaller than the pivot go to the left and larger elements go to the right. It then recursively sorts the sub-arrays.
- **Merge Sort**: A divide-and-conquer algorithm that divides the array into two halves, recursively sorts them, and then merges the two sorted halves into one sorted array.

---

## 2. Comparison of Bubble Sort and Quick Sort Time Complexities

| Algorithm | Best-Case | Average-Case | Worst-Case | Space Complexity | Stable? |
|---|---|---|---|---|---|
| **Bubble Sort** | \(O(N)\) (optimized with swap check) | \(O(N^2)\) | \(O(N^2)\) | \(O(1)\) (in-place) | Yes |
| **Quick Sort** | \(O(N \log N)\) | \(O(N \log N)\) | \(O(N^2)\) (when pivot is poor, e.g. sorted array) | \(O(\log N)\) (recursive stack) | No |

---

## 3. Why Quick Sort is Generally Preferred
- **Average Performance**: Quick Sort's average-case time complexity is \(O(N \log N)\), which is drastically faster than Bubble Sort's \(O(N^2)\). For 10,000 orders, Quick Sort takes roughly \(10000 \times 14 \approx 140,000\) operations, while Bubble Sort takes up to \(100,000,000\) operations.
- **Cache Friendliness**: Quick Sort exhibits excellent locality of reference, which makes it highly compatible with modern CPU caches.
- **Practical Speed**: In practice, Quick Sort is often faster than other \(O(N \log N)\) algorithms (like Merge Sort) because its inner loop can be efficiently implemented on most architectures.
