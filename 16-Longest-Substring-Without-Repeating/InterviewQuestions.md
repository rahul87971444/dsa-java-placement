# Longest Substring Without Repeating Characters

## Q1. What is the brute-force approach?

Start from every index and keep adding characters until a duplicate occurs.

### Time Complexity

```text
O(n²) average
```

### Space Complexity

```text
O(n)
```

---

## Q2. What is the optimal approach?

Use:

```text
Sliding Window + HashSet
```

### Time Complexity

```text
O(n) average
```

### Space Complexity

```text
O(n)
```

---

## Q3. What does the window represent?

The window represents the current substring containing unique characters.

```text
[left ... right]
```

---

## Q4. What does the right pointer do?

```text
EXPANDS
```

the window.

It tries to include new characters.

---

## Q5. What does the left pointer do?

```text
SHRINKS
```

the window when the current condition becomes invalid.

---

## Q6. Why HashSet?

We need to quickly answer:

```text
Does this character already exist in my current window?
```

HashSet provides average:

```text
O(1)
```

lookup.

---

## Q7. Why use while instead of if?

One removal may not always be enough to restore the no-duplicate condition.

We continue shrinking until the duplicate is gone.

Therefore:

```java
while (set.contains(ch))
```

---

## Q8. Why remove s.charAt(left)?

The leftmost character is leaving the window.

Therefore it must also be removed from the HashSet.

---

## Q9. Why left++?

After removing the leftmost character, the window begins at the next position.

---

## Q10. Why right - left + 1?

Both left and right positions are included.

Example:

```text
left  = 2
right = 5
```

Indices:

```text
2,3,4,5
```

Total:

```text
4
```

Formula:

```text
5 - 2 + 1 = 4
```

---

## Q11. Why is it O(n) despite the while loop?

Both pointers move only forward.

Right visits each character once.

Left removes each character at most once.

Therefore total pointer movement is O(n).

---

## Q12. What if the String is empty?

Input:

```text
""
```

Output:

```text
0
```

---

## Q13. What if all characters are unique?

Input:

```text
abcdef
```

Output:

```text
6
```

The window keeps expanding.

---

## Q14. What if all characters are the same?

Input:

```text
aaaa
```

Output:

```text
1
```

The window repeatedly shrinks when another `a` appears.

---

## Q15. What pattern is used?

```text
Variable Size Sliding Window
```

because the window expands and shrinks depending on the duplicate condition.

---

## Q16. How to Recognize Sliding Window?

Look for:

```text
Substring
Subarray
Continuous
Longest
Shortest
At most K
Without repeating
```

Then ask:

```text
Can I maintain a valid continuous window?
```

If yes, Sliding Window may be the correct pattern.

---

## Q17. Sliding Window vs Two Pointer?

Sliding Window is a specialized Two Pointer technique.

Two Pointer may compare elements from different positions.

Sliding Window usually maintains:

```text
A continuous range
[left ... right]
```

with some condition.

---

## Q18. Common Mistakes

- Using `if` instead of `while`.
- Forgetting to remove the left character from HashSet.
- Forgetting `+1` in window length.
- Resetting the entire window unnecessarily.
- Confusing substring with subsequence.

---

## Q19. Interview Explanation

The brute-force approach checks substrings starting from every index and takes O(n²).

I can optimize it using a variable-size sliding window.

The right pointer expands the window and a HashSet stores the characters currently inside it.

If a duplicate appears, I move the left pointer and remove characters until the window becomes valid again.

Since both pointers move only forward, the overall time complexity is O(n) average with O(n) extra space.

---

## Q20. One-Line Revision

```text
Right → Expand

Duplicate?
   ↓
Left → Shrink

Valid Window
   ↓
Update Maximum
```
