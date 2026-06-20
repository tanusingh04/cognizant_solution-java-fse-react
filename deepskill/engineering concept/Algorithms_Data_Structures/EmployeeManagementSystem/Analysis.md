# Exercise 4: Employee Management System Analysis

## 1. Array Representation in Memory
An array is a linear data structure containing elements of the same type stored in contiguous memory locations.
- **Representation**: Because elements are contiguous, the memory address of any element at index \(i\) can be calculated directly using the base address of the array:
  \[\text{Address}(A[i]) = \text{Base Address} + i \times \text{Size of element}\]
- **Advantages**:
  - **Random Access**: Constant time \(O(1)\) lookup of elements by index.
  - **Memory Efficiency**: Minimal overhead since no pointers or node metadata are stored.
  - **CPU Cache Optimization**: Elements are close in memory, which benefits spatial locality.

---

## 2. Time Complexity of Operations

### Add
- **Time Complexity**: \(O(1)\) (inserting at the end of the array, tracking the current size). If inserting at a specific index or resizing a full array, it becomes \(O(N)\).
- **Space Complexity**: \(O(1)\) auxiliary space.

### Search (by Employee ID)
- **Time Complexity**: \(O(N)\) (worst/average case). We must traverse the array linearly to find the ID.
- **Space Complexity**: \(O(1)\).

### Traverse
- **Time Complexity**: \(O(N)\). Every active item in the array is visited once.
- **Space Complexity**: \(O(1)\).

### Delete (by Employee ID)
- **Time Complexity**: \(O(N)\). We search for the employee linearly, and upon deletion, we must shift the subsequent elements to the left to maintain contiguous order.
- **Space Complexity**: \(O(1)\).

---

## 3. Limitations of Arrays and When to Use Them
- **Limitations**:
  - **Fixed Size**: Once initialized, their size cannot be changed dynamically. To grow, a new larger array must be allocated and elements copied.
  - **Costly Insertions/Deletions**: Shifting elements during insertion or deletion takes \(O(N)\) time.
- **When to Use**:
  - When the maximum size of the collection is known beforehand and doesn't change frequently.
  - When random access by index is the most critical operation.
  - When memory overhead must be kept to a bare minimum.
