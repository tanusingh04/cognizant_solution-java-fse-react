# Exercise 6: Library Management System Analysis

## 1. Search Algorithms Overview
- **Linear Search**: Checks each element of the list sequentially until a match is found or the entire list has been searched. It does not require sorted data.
- **Binary Search**: A fast search algorithm that operates on sorted lists. It compares the target value to the middle element. If they are unequal, the half in which the target cannot exist is eliminated, and the search continues on the remaining half.

---

## 2. Comparison of Linear Search and Binary Search Time Complexities

| Algorithm | Best-Case | Average-Case | Worst-Case | Data Ordering Requirement |
|---|---|---|---|---|
| **Linear Search** | \(O(1)\) (target is first) | \(O(N)\) | \(O(N)\) | None (unsorted data) |
| **Binary Search** | \(O(1)\) (target is middle) | \(O(\log N)\) | \(O(\log N)\) | Must be sorted |

---

## 3. Recommendation based on Dataset Size and Order
- **When to Use Linear Search**:
  - Small datasets (e.g., under 100 books) where the overhead of sorting the array is larger than the search cost.
  - When the list is highly dynamic (items added/removed constantly) and sorting is too expensive to maintain.
  - When books are unsorted, and searches are performed infrequently.
- **When to Use Binary Search**:
  - Moderate to large datasets (e.g., thousands or millions of books).
  - When search performance is critical and books are sorted, or when sorting can be done once and searched many times (e.g. read-heavy workload).
