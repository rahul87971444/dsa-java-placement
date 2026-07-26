# Remove Duplicates from Sorted Array

---

## Q1. Why is the array being sorted important?

Because duplicate elements are adjacent.

This allows us to compare only neighboring elements.

---

## Q2. Brute Force approach?

Store unique elements using HashSet.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Better approach?

Store unique elements in an ArrayList.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q4. Optimal approach?

Use Two Pointers.

One pointer tracks the last unique element.

The other scans the array.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q5. Explain this line

```java
nums[++i] = nums[j];
```

Step 1

Increase `i` to the next write position.

Step 2

Copy the new unique element from `j`.

Example:

```
Before

1 1 2 2 3
↑   ↑
i   j

After finding 2

1 2 2 2 3
  ↑
  i
```

---

## Q6. Why doesn't this work for an unsorted array?

Because duplicates are not guaranteed to be adjacent.

Example:

```
1 3 2 1 2
```

The algorithm would miss duplicates.

---

## Q7. Pattern Used

```
Sorted Array

↓

Two Pointer

↓

In-place Write
```

---

## Q8. Similar Questions

- Move Zeroes
- Merge Sorted Array
- Remove Element
- Sort Colors

---

## Q9. Common Mistakes

❌ Forgetting the array must be sorted.

❌ Returning `i` instead of `i + 1`.

❌ Comparing the wrong indices.

---

## Q10. Interview Discussion

**Interviewer:**

Why not use HashSet?

**Answer:**

HashSet uses extra memory.

The interviewer specifically asks for an in-place solution.

Therefore, Two Pointer is preferred.

---

## Q11. One-Line Revision

```
Sorted

↓

Compare Adjacent

↓

Store Unique
```
