# Exercise 1: Inventory Management System Analysis

## 1. Why Data Structures and Algorithms are Essential
In warehouse inventory management systems, records can easily grow to hundreds of thousands or millions of products. 
- **Efficiency**: Performing lookups, updates, and deletes linearly on a massive collection would result in unacceptable delays.
- **Scalability**: Proper data structures and algorithms ensure that the application remains fast and responsive regardless of how large the inventory becomes.
- **Resource Management**: Efficient data structures save memory space and CPU cycles.

## 2. Selection of Data Structure
For this problem, we chose a **HashMap** (specifically keying the `productId` to its `Product` object). Let's compare this choice against another common option, `ArrayList`.

| Operations | ArrayList (Unsorted) | ArrayList (Sorted by ID) | HashMap (Chosen) |
|---|---|---|---|
| **Add** | \(O(1)\) (append) or \(O(N)\) (check duplicate) | \(O(N)\) (need to insert in order) | \(O(1)\) (amortized) |
| **Update** | \(O(N)\) (linear search by ID first) | \(O(\log N)\) (binary search) + \(O(1)\) | \(O(1)\) (direct key lookup) |
| **Delete** | \(O(N)\) (search + shift elements) | \(O(N)\) (search + shift elements) | \(O(1)\) (direct deletion) |

- **ArrayList**: A simple sequential list. To update or delete, we must search for the item first (taking \(O(N)\) time). Even if the list is sorted to allow \(O(\log N)\) binary search lookup, deleting requires shifting elements which takes \(O(N)\) time in the worst case.
- **HashMap**: Maps `productId` directly to the `Product` object. HashMaps provide \(O(1)\) average time complexity for lookup, addition, modification, and deletion. This is optimal for an inventory system where product IDs are unique and lookups by ID are frequent.

## 3. Complexity Analysis of Operations (HashMap)

### Add Product
- **Time Complexity**: \(O(1)\) average. In the worst case (rare, when many keys collide in the same hash bucket), it can degrade to \(O(N)\) if the bucket is a linked list (or \(O(\log N)\) in Java 8+ where buckets transition to balanced trees).
- **Space Complexity**: \(O(1)\) auxiliary space.

### Update Product
- **Time Complexity**: \(O(1)\) average. Fetching the product by key and updating its attributes is done in constant time.
- **Space Complexity**: \(O(1)\).

### Delete Product
- **Time Complexity**: \(O(1)\) average. The element is removed directly using its hash value.
- **Space Complexity**: \(O(1)\).

## 4. Further Optimizations
- **Initial Capacity and Load Factor**: For large inventories, we can pre-size the `HashMap` to prevent costly rehashing operations as the map grows.
- **Concurrent Access**: In a multi-threaded warehouse application (where multiple workers add/remove items concurrently), we should use `ConcurrentHashMap` or synchronize access to prevent data inconsistency.
