# Search in Rotated Sorted Array — Interview Questions

## Q1. Why can't we use normal binary search directly?

Because the entire array is no longer sorted.

Example:

```text
[4,5,6,7,0,1,2]
```

It has a break between:

```text
7 and 0
```

---

## Q2. What important property does the array still have?

At least one half of the current search range is sorted.

That is the key observation.

---

## Q3. How do you determine which half is sorted?

Check:

```java
nums[left] <= nums[mid]
```

If true:

```text
left → mid is sorted
```

Otherwise:

```text
mid → right is sorted
```

---

## Q4. Why use:

```java
nums[left] <= nums[mid]
```

instead of:

```java
nums[left] < nums[mid]
```

For LeetCode 33, all values are distinct, so either effectively works in the intended setting.

The `<=` form is commonly used and also communicates the sorted-half condition clearly.

---

## Q5. Once you find the sorted half, what do you ask?

Ask:

```text
Is the target inside this sorted range?
```

If yes:

```text
Search that half.
```

If no:

```text
Discard that half.
```

---

## Q6. Why does the algorithm remain O(log n)?

Each iteration eliminates approximately half of the remaining search space.

That is the fundamental property of binary search.

---

## Q7. What is the biggest difference from normal binary search?

Normal binary search:

```text
Check mid
↓
Use sorted order
↓
Discard half
```

Rotated binary search:

```text
Check mid
↓
Find which half is sorted
↓
Check whether target belongs there
↓
Discard half
```

---

## Q8. What if the target equals nums[mid]?

Immediately return:

```text
mid
```

because the target has been found.

---

## Q9. What if the array has not actually been rotated?

Example:

```text
[1,2,3,4,5]
```

The algorithm still works.

The entire range behaves like a normal sorted array.

---

## Q10. What if k rotations produce the same array?

The algorithm only cares about the final rotated arrangement.

It does not need to know how many rotations were performed.

---

## Q11. What is the brute-force solution?

Simply scan every element.

### Complexity

```text
O(n)
```

---

## Q12. Why is the binary-search solution better?

Because:

```text
O(log n)
```

is much faster than:

```text
O(n)
```

for large arrays.

---

## Q13. Can this exact logic be used when duplicate values are allowed?

Not always with the same clean O(log n) guarantee.

Duplicates can make it impossible to determine which side is sorted from the boundary comparison alone.

In duplicate versions, additional handling may be required, and worst-case complexity can degrade.

---

## Q14. What happens if:

```text
nums = [4,5,6,7,0,1,2]
target = 3
```

There is no `3`.

Return:

```text
-1
```

---

## Q15. What is the key interview insight?

Even though the whole array is not sorted:

```text
at least one half is sorted
```

That allows binary search to continue.

---

## Q16. What category does this problem belong to?

```text
Binary Search
+
Modified Binary Search
```

---

## Q17. Common Mistake

Trying to determine whether the target is less than or greater than `mid` without first identifying which half is sorted.

In a rotated array, ordinary comparisons with `mid` are not enough.

---

## Q18. Interviewer: Explain the algorithm in one minute.

First I calculate the middle element. If it is the target, I return its index. Otherwise, I determine which half is sorted by comparing the left and middle values. If the left half is sorted, I check whether the target lies within that sorted range. If it does, I search the left half; otherwise I search the right half. If the left half isn't sorted, the right half must be sorted, so I perform the same logic there. Each step discards half of the search space, giving O(log n) time and O(1) space.

---

## Q19. One-Line Revision

```text
Find Mid
   ↓
Which Half Is Sorted?
   ↓
Target Inside That Half?
   ↓
YES → Search There
NO  → Search Other Half
```
