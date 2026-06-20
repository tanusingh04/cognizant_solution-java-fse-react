# Exercise 5: Task Management System Analysis

## 1. Linked Lists Overview
A linked list is a linear data structure where elements (nodes) are not stored in contiguous memory locations. Instead, each node contains a data field and a reference (pointer) to the next node in the sequence.

### Types of Linked Lists
- **Singly Linked List**: Each node contains data and a pointer to the *next* node. Traversal is only possible in the forward direction.
- **Doubly Linked List**: Each node contains data, a pointer to the *next* node, and a pointer to the *previous* node. This allows traversal in both directions but increases memory consumption due to the extra pointer per node.

---

## 2. Time Complexity of Operations (Singly Linked List)

### Add (Append at End)
- **Time Complexity**: \(O(N)\) if we only maintain a pointer to the `head` (since we must traverse the list to find the last node). It can be optimized to \(O(1)\) if we keep a `tail` pointer.
- **Space Complexity**: \(O(1)\) auxiliary space.

### Search
- **Time Complexity**: \(O(N)\). In the worst case, we must traverse the entire list to locate the target node or determine it is not present.
- **Space Complexity**: \(O(1)\).

### Traverse
- **Time Complexity**: \(O(N)\). We visit each node in the sequence exactly once.
- **Space Complexity**: \(O(1)\).

### Delete
- **Time Complexity**: \(O(N)\) to find the node. However, once the node (and its predecessor) is identified, the deletion/linking itself takes \(O(1)\) time.
- **Space Complexity**: \(O(1)\).

---

## 3. Advantages of Linked Lists over Arrays for Dynamic Data
- **Dynamic Size**: Linked lists do not have a fixed size. They grow and shrink at runtime dynamically as nodes are added or removed, preventing memory wastage or allocation errors.
- **Efficient Insertion/Deletion**: Inserting or deleting a node does not require shifting elements (unlike arrays). Once the position is found, the reference reassignment takes \(O(1)\) time.
- **No Pre-allocation**: There is no need to pre-allocate memory buffers, saving initial memory resources.
