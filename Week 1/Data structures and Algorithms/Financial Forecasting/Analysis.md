# Exercise 7: Financial Forecasting – Analysis

## 1. Recursion

Recursion is a programming technique in which a method calls itself repeatedly until a base condition is reached. It simplifies problems that can be broken down into smaller, similar subproblems.

In this exercise, recursion is used to calculate the future value year by year until the required number of years becomes zero.

---

## 2. Recursive Algorithm

Future Value = Current Value × (1 + Growth Rate)

The recursive method repeatedly applies the annual growth rate until all years have been processed.

---

## 3. Time Complexity

Each recursive call processes one year.

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

where **n** is the number of years.

---

## 4. Optimization

The recursive solution creates one function call for every year, increasing memory usage due to the call stack.

The algorithm can be optimized by:

* Using an iterative loop instead of recursion.
* Using Dynamic Programming (Memoization) when repeated calculations occur.

These approaches reduce memory overhead while maintaining the same result.

---

## 5. Conclusion

The recursive approach provides a simple and intuitive implementation for financial forecasting. However, for a large number of years, an iterative approach is generally preferred because it avoids excessive recursive calls and improves memory efficiency.
