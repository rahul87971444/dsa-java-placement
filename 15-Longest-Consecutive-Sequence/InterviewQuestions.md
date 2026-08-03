# Longest Consecutive Sequence — Interview Questions

## Q1. What is the problem asking?

Find the length of the longest sequence of consecutive integer values.

Example:

```text
[100,4,200,1,3,2]
```

Longest:

```text
1,2,3,4
```

Answer:

```text
4
```

---

## Q2. Do the consecutive numbers need to be adjacent in the array?

No.

They only need to be consecutive by value.

Example:

```text
[4,100,2,1,3]
```

still contains:

```text
1,2,3,4
```

---

## Q3. What is the brute-force approach?

For each number, repeatedly search for the next number.

### Time Complexity

```text
O(n²) or worse depending on repeated searches
```

### Space Complexity

```text
O(1)
```

---

## Q4. What is the sorting approach?

Sort the array and count consecutive neighboring values.

### Time Complexity

```text
O(n log n)
```

### Space Complexity

```text
Depends on sorting implementation
```

---

## Q5. What is the optimal approach?

Use a HashSet.

Start counting only when:

```java
!set.contains(num - 1)
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

## Q6. Why HashSet?

Because we repeatedly need to check:

```text
Does this number exist?
```

HashSet provides:

```text
O(1) average lookup
```

---

## Q7. Explain:

```java
!set.contains(num - 1)
```

It checks whether the current number has a predecessor.

If predecessor does not exist:

```text
Current Number = Sequence Start
```

Example:

```text
1 2 3 4
```

For `1`:

```text
0 does not exist
```

Therefore `1` is the start.

---

## Q8. Why not start from every number?

Suppose:

```text
1 2 3 4
```

Starting from 1:

```text
1 → 2 → 3 → 4
```

Starting again from 2:

```text
2 → 3 → 4
```

Then 3:

```text
3 → 4
```

This repeats unnecessary work.

Instead, start only from:

```text
1
```

---

## Q9. Why is the optimized solution O(n) even though it has a while loop inside a for loop?

Nested loops do not automatically mean O(n²).

The while loop runs only from sequence-start elements.

Example:

```text
1 2 3 4
```

Only `1` starts the sequence.

`2`, `3`, and `4` are skipped as starts because their predecessors exist.

Therefore sequence traversal is not repeatedly restarted from every element.

With average O(1) HashSet operations, total expected time is O(n).

---

## Q10. Why iterate over the HashSet instead of nums?

Duplicates do not need to be processed repeatedly.

HashSet removes duplicate values.

This makes the logic cleaner.

---

## Q11. What if duplicates exist?

Example:

```text
[1,2,2,3,4]
```

HashSet becomes:

```text
1 2 3 4
```

Answer remains:

```text
4
```

---

## Q12. What if the array is empty?

Return:

```text
0
```

---

## Q13. What if there is only one number?

Example:

```text
[10]
```

Longest sequence:

```text
10
```

Length:

```text
1
```

---

## Q14. Why not always sort?

Sorting works.

But sorting requires:

```text
O(n log n)
```

The HashSet solution achieves:

```text
O(n) average
```

which meets the intended optimal complexity.

---

## Q15. What pattern is used?

```text
HashSet
+
Sequence Start Detection
```

---

## Q16. How do you recognize this pattern?

Look for:

```text
Unsorted Array

Consecutive Numbers

Longest Sequence

Fast Existence Checking
```

Think:

```text
HashSet
```

Then ask:

```text
How can I identify the beginning?
```

Answer:

```text
num - 1 doesn't exist
```

---

## Q17. Common Mistake

Starting a sequence from every number.

This causes repeated work.

---

## Q18. Another Common Mistake

Checking:

```java
!set.contains(num + 1)
```

to find the beginning.

Wrong.

Beginning means:

```text
Previous number does NOT exist.
```

Therefore:

```java
!set.contains(num - 1)
```

---

## Q19. Interview Discussion

Interviewer:

Why is `num - 1` important?

Answer:

If `num - 1` exists, then `num` belongs somewhere in the middle of an existing sequence, so there is no reason to start counting from it.

I start only when the predecessor is missing, which guarantees that each consecutive sequence is explored from its true beginning.

---

## Q20. One-Line Revision

```text
Previous Exists?

YES → Skip

NO → Start Sequence

Then Keep Checking +1
```
