# Merge Sorted Array - Interview Questions

---

## Q1. What is the brute-force solution?

Copy nums2 into nums1.

Sort the complete array.

### Time Complexity

```
O((m+n) log(m+n))
```

### Space Complexity

```
O(1)
```

---

## Q2. Better solution?

Create a third array.

Merge both arrays.

### Time Complexity

```
O(m+n)
```

### Space Complexity

```
O(m+n)
```

---

## Q3. Optimal solution?

Use

```
Three Pointers

i

j

k
```

Start from the END.

### Time Complexity

```
O(m+n)
```

### Space Complexity

```
O(1)
```

---

## Q4. Why start from the END?

Because

```
Empty spaces

↓

Already exist

↓

At the END
```

If we merge from the beginning,

existing values get overwritten.

---

## Q5. Explain

```java
int i = m - 1;
```

`i` points to the last valid element in `nums1`.

Example

```
1 2 3 0 0 0

      ↑

      i
```

---

## Q6. Explain

```java
int j = n - 1;
```

Points to the last element of nums2.

---

## Q7. Explain

```java
int k = m+n-1;
```

Points to the last position where the largest element should be placed.

---

## Q8. Why compare

```java
nums1[i]

nums2[j]
```

The larger value must go at the current end position.

---

## Q9. Why is there only

```java
while(j>=0)
```

afterwards?

If nums2 still has elements,

they must be copied.

If nums1 still has elements,

they are already in the correct place.

No copying is needed.

---

## Q10. Pattern Used

```
Two Pointer

↓

Reverse Traversal
```

---

## Q11. Similar Problems

- Merge Intervals

- Merge Two Sorted Lists

- Sort Colors

- Squares of Sorted Array

---

## Q12. Interview Discussion

Interviewer

"Why didn't you merge from the front?"

Answer

Because

```
Front Merge

↓

Overwrites

↓

Existing Elements
```

Back traversal avoids overwriting.

---

## Q13. Common Mistakes

❌

Starting from front.

❌

Wrong pointer initialization.

❌

Forgetting

```
while(j>=0)
```

---

## Q14. Can duplicate values exist?

Yes.

The algorithm handles duplicates correctly.

---

## Q15. One-Line Revision

```
Need Merge

↓

Start From Back

↓

Largest First

↓

No Overwrite
```
