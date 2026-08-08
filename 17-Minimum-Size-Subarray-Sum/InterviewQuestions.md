# Minimum Size Subarray Sum — Interview Questions

## Q1. What is the brute-force approach?

Start from every index and keep adding elements until the target is reached.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

## Q2. What is the better approach?

Use Prefix Sum and Binary Search.

### Time Complexity

```text
O(n log n)
```

### Space Complexity

```text
O(n)
```

---

## Q3. What is the optimal approach?

Use a variable-size Sliding Window.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

## Q4. Why does Sliding Window work here?

Because all numbers are positive.

When we expand:

```text
sum increases
```

When we shrink:

```text
sum decreases
```

This predictable behavior allows us to adjust the window.

---

## Q5. What happens when sum < target?

The window is too small.

Expand:

```text
right++
```

---

## Q6. What happens when sum >= target?

The window is valid.

Try to make it smaller:

```text
left++
```

while maintaining:

```text
sum >= target
```

---

## Q7. Why use while instead of if?

Because one removal may not be enough.

We want the smallest valid window.

Therefore we continue shrinking as long as:

```text
sum >= target
```

---

## Q8. Why is the answer updated before removing nums[left]?

The current window is valid at that moment.

We must record its length before changing it.

---

## Q9. Why is window length:

```java
right - left + 1
```

Because both endpoints are included.

Example:

```text
left = 2
right = 4
```

Elements:

```text
2,3,4
```

Length:

```text
4 - 2 + 1 = 3
```

---

## Q10. Why is the answer initialized with Integer.MAX_VALUE?

We haven't found a valid window yet.

So we need a value larger than any possible window length.

After finding a valid window:

```java
Math.min()
```

can replace it with the real answer.

---

## Q11. What if no subarray reaches the target?

Return:

```text
0
```

---

## Q12. What if target is 7 and array is:

```text
[1,1,1,1]
```

No subarray has sum >= 7.

Answer:

```text
0
```

---

## Q13. What is the main pattern?

```text
Variable Size Sliding Window
```

---

## Q14. How to recognize this pattern?

Look for:

```text
Contiguous subarray
+
Positive numbers
+
Target sum
+
Minimum/Maximum length
```

Think:

```text
Sliding Window
```

---

## Q15. Difference between this and Longest Substring Without Repeating Characters?

Longest Substring:

```text
Expand
+
Shrink when invalid
+
Keep maximum
```

Minimum Subarray Sum:

```text
Expand until valid
+
Shrink while valid
+
Keep minimum
```

---

## Q16. Memory Trick

For maximum:

```text
Expand → Keep Valid → Maximum
```

For minimum:

```text
Expand → Become Valid → Shrink → Minimum
```

---

## Q17. Common Mistakes

- Using Sliding Window when negative numbers are present.
- Using `if` instead of `while`.
- Forgetting `right - left + 1`.
- Forgetting to subtract `nums[left]`.
- Updating the answer after making the window invalid.

---

## Q18. Interview Explanation

The brute-force approach checks every possible subarray and takes O(n²).

Because all numbers are positive, I can use a variable-size sliding window.

I expand the right pointer until the sum becomes at least the target. Then I update the answer and shrink from the left while the window remains valid.

Both pointers move only forward, so the total time is O(n), with O(1) extra space.

---

## Q19. One-Line Revision

```text
Sum Too Small
    ↓
Expand Right

Sum Valid
    ↓
Record Answer

Still Valid
    ↓
Shrink Left
```
