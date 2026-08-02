# 3Sum — Interview Questions

## Q1. What is the brute-force approach?

Use three nested loops and check every triplet.

### Time Complexity

```text
O(n³)
```

### Space Complexity

```text
O(1)
```

excluding storage needed to remove/store duplicate results.

---

## Q2. What is the better approach?

Fix one element and use a HashSet to find the remaining two elements.

### Time Complexity

```text
O(n²) average
```

### Auxiliary Space Complexity

```text
O(n)
```

excluding output.

---

## Q3. What is the preferred interview approach?

Sort the array.

Fix one element.

Apply Two Pointer to the remaining portion.

### Time Complexity

```text
O(n²)
```

Sorting takes:

```text
O(n log n)
```

The nested fixed-element + two-pointer phase takes:

```text
O(n²)
```

Therefore overall:

```text
O(n²)
```

### Extra Space Complexity

```text
O(1)
```

excluding output and implementation-dependent sorting space.

---

## Q4. How is 3Sum related to Two Sum?

Equation:

```text
a + b + c = 0
```

Fix `a`.

Then:

```text
b + c = -a
```

So 3Sum becomes Two Sum on the remaining array.

---

## Q5. Why sort the array?

Sorting provides two major benefits:

1. Two Pointer becomes possible.
2. Duplicate triplets become easy to skip.

---

## Q6. Why move left when sum < 0?

Example:

```text
sum = -5
```

We want:

```text
0
```

So we need a larger value.

Since the array is sorted:

```text
left++
```

moves toward a larger number.

---

## Q7. Why move right when sum > 0?

The sum is too large.

We need a smaller number.

Therefore:

```text
right--
```

---

## Q8. Why skip duplicate i values?

Example:

```text
[-1,-1,0,1]
```

If both `-1`s are processed as the fixed element, the same triplet may be generated repeatedly.

Therefore:

```java
if (i > 0 && nums[i] == nums[i - 1])
    continue;
```

---

## Q9. Why skip duplicates after finding a triplet?

Suppose:

```text
[-2,0,0,0,2]
```

Without skipping duplicates, the same:

```text
[-2,0,2]
```

could be added multiple times.

---

## Q10. Why not use a normal Two Sum HashMap directly?

You can use hashing after fixing one element.

However, handling duplicate triplets becomes more complicated.

Sorting + Two Pointer provides a clean O(n²) interview solution.

---

## Q11. Can we use Two Pointer without sorting?

Not with this movement logic.

The decisions:

```text
sum < 0 → left++

sum > 0 → right--
```

only work because the array is sorted.

---

## Q12. Pattern Used

```text
Sorting
   +
Fix One
   +
Two Pointer
```

---

## Q13. Common Mistake

Forgetting:

```java
i > 0
```

in:

```java
if (i > 0 && nums[i] == nums[i - 1])
```

Without it, `nums[i - 1]` would be invalid when `i = 0`.

---

## Q14. Another Common Mistake

After finding:

```text
sum == 0
```

do not stay at the same pointers.

Move both:

```java
left++;
right--;
```

and skip duplicates.

---

## Q15. Edge Case

Input:

```text
[0,0,0,0]
```

Output:

```text
[[0,0,0]]
```

Not:

```text
[[0,0,0],[0,0,0]]
```

Triplets must be unique.

---

## Q16. How to Recognize This Pattern?

If the question asks:

```text
Three numbers

Triplets

Target sum

Unique combinations
```

think:

```text
Sort
 ↓
Fix One
 ↓
Two Pointer
```

---

## Q17. Interviewer: Can you reduce O(n³)?

Answer:

Yes.

I can fix one element, reducing the remaining problem to Two Sum.

After sorting, Two Sum can be solved using two pointers in O(n).

Since I do this for each fixed element, total complexity becomes O(n²).

---

## Q18. One-Line Revision

```text
3 Numbers
   ↓
Fix 1
   ↓
Find Remaining 2
   ↓
Two Pointer
```
