# Find Missing Number — Interview Questions

## Q1. What is the easiest mathematical solution?

Use:

```text
Expected Sum - Actual Sum
```

Expected sum:

```text
n(n+1)/2
```

Time:

```text
O(n)
```

Space:

```text
O(1)
```

---

## Q2. Why might the sum approach be risky?

The expression:

```text
n × (n + 1)
```

can overflow an `int` for sufficiently large n.

Using `long` for the calculation helps avoid 32-bit integer overflow within the supported range.

---

## Q3. Why is XOR useful here?

Because equal values cancel:

```text
x ^ x = 0
```

and:

```text
x ^ 0 = x
```

Therefore all present values cancel against their expected counterparts, leaving the missing value.

---

## Q4. Explain:

```java
xor ^= value;
```

It is shorthand for:

```java
xor = xor ^ value;
```

---

## Q5. Why does XOR not have an overflow problem like addition?

XOR operates bit-by-bit and does not calculate a potentially huge arithmetic sum.

Therefore the XOR approach avoids the sum-overflow issue.

---

## Q6. Why initialize XOR with nums.length?

The expected range is:

```text
0 through n
```

The loop processes:

```text
0 through n-1
```

So we initialize with:

```text
n
```

to include the last expected number.

---

## Q7. Why don't we need a Set?

A Set could tell us which numbers exist, but it would require O(n) extra space.

XOR gives:

```text
O(n) time
O(1) space
```

---

## Q8. Can we use a boolean array?

Yes.

Create a boolean array representing whether each number was seen.

But that requires:

```text
O(n)
```

extra space.

---

## Q9. Why does sorting work?

After sorting, the expected value at index `i` is normally:

```text
i
```

The first mismatch identifies the missing value.

---

## Q10. What happens if the missing number is n?

Example:

```text
[0,1,2]
```

Here:

```text
n = 3
```

Missing:

```text
3
```

The XOR solution still works.

---

## Q11. What happens if the missing number is 0?

Example:

```text
[1,2,3]
```

Expected:

```text
0,1,2,3
```

Missing:

```text
0
```

The XOR solution still works.

---

## Q12. What assumptions does LeetCode 268 make?

The array contains `n` distinct numbers from:

```text
0 through n
```

with exactly one number missing.

---

## Q13. Would the XOR solution work if a number appeared twice and another number appeared twice?

Not necessarily.

The cancellation argument depends on the problem's exact guarantee: every expected value appears either once or is the single missing value.

---

## Q14. What is the difference between XOR and OR?

XOR:

```text
1 ^ 1 = 0
```

OR:

```text
1 | 1 = 1
```

XOR is useful here because identical values cancel.

---

## Q15. Why not use subtraction repeatedly?

You could derive the missing value using arithmetic, but the sum formula is cleaner.

XOR is especially attractive because it avoids arithmetic overflow concerns.

---

## Q16. Which solution would you give in an interview?

I would mention the sum solution first because it is simple, then give XOR if the interviewer wants a robust O(n), O(1)-space approach.

---

## Q17. Interview Answer

"The array contains n distinct values from 0 to n with one missing. A simple approach is expected sum minus actual sum, but the sum calculation can overflow an int for large values. I can instead XOR all expected numbers with all array values. Since x XOR x is zero and x XOR zero is x, every matching value cancels and only the missing number remains. This gives O(n) time and O(1) space."

---

## Q18. One-Line Revision

```text
Expected values
XOR
Actual values
    ↓
Matching values cancel
    ↓
Missing value remains
```
