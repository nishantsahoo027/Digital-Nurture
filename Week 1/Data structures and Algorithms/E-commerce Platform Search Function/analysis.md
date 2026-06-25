# Exercise 2: E-commerce Platform Search Function – Analysis

## 1. Big O Notation

Big O notation is used to measure the efficiency of an algorithm by describing how its execution time grows as the input size increases. It helps compare algorithms and determine which one is more suitable for large datasets.

---

## 2. Linear Search

### Working

Linear Search checks each product one by one until the required product is found or the end of the array is reached.

### Time Complexity

* **Best Case:** O(1)

  * The product is found at the first position.

* **Average Case:** O(n)

  * The product is found somewhere in the middle of the array.

* **Worst Case:** O(n)

  * The product is at the last position or is not present in the array.

### Advantages

* Easy to implement.
* Works on both sorted and unsorted data.

### Disadvantages

* Slow for large datasets because every element may need to be checked.

---

## 3. Binary Search

### Working

Binary Search repeatedly divides the sorted array into two halves until the required product is found.

### Time Complexity

* **Best Case:** O(1)

  * The product is found at the middle position.

* **Average Case:** O(log n)

* **Worst Case:** O(log n)

### Advantages

* Much faster than Linear Search for large datasets.
* Performs very few comparisons.

### Disadvantages

* The array must be sorted before performing Binary Search.

---

## 4. Comparison

| Feature          | Linear Search      | Binary Search |
| ---------------- | ------------------ | ------------- |
| Data Requirement | Sorted or Unsorted | Sorted Only   |
| Best Case        | O(1)               | O(1)          |
| Average Case     | O(n)               | O(log n)      |
| Worst Case       | O(n)               | O(log n)      |
| Performance      | Slower             | Faster        |

---

## 5. Conclusion

For an e-commerce platform containing thousands or millions of products, Binary Search is more suitable because it has a time complexity of O(log n), making product searches significantly faster than Linear Search. Although Binary Search requires the product list to be sorted, its efficiency makes it the preferred choice for large-scale applications.
