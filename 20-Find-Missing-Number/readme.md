# 🔢 Find the Missing Number — LeetCode 268

Given an array containing `n` distinct numbers taken from the range:

```text
0 to n
```

find the one missing number.

---

## Example 1

Input:

```text
[3,0,1]
```

Numbers should be:

```text
0,1,2,3
```

Missing:

```text
2
```

Output:

```text
2
```

---

## Example 2

Input:

```text
[9,6,4,2,3,5,7,0,1]
```

Numbers should be:

```text
0 1 2 3 4 5 6 7 8 9
```

Missing:

```text
8
```

---

# 🚀 Approaches

| Approach | Time | Extra Space |
|---|---:|---:|
| Sorting | O(n log n) | O(1) or O(n) depending on sort |
| Sum Formula | O(n) | O(1) |
| XOR | O(n) | O(1) |

---

# 🧠 Approach 1 — Sorting

Sort the array.

Then compare:

```text
index
```

with:

```text
value
```

Find where they differ.

---

# 🧠 Approach 2 — Sum Formula

Numbers from:

```text
0 to n
```

have expected sum:

```text
n × (n + 1) / 2
```

Then:

```text
Missing =
Expected Sum - Actual Sum
```

Example:

```text
n = 3
```

Expected:

```text
3 × 4 / 2 = 6
```

Actual:

```text
3 + 0 + 1 = 4
```

Missing:

```text
6 - 4 = 2
```

---

# ⚠️ Problem With Sum Approach

For very large values,:

```text
n × (n + 1)
```

can overflow an integer type.

Java provides larger integer types such as:

```text
long
```

to reduce this risk.

---

# 🔥 Approach 3 — XOR

XOR has two extremely useful properties:

```text
x ^ x = 0
```

and:

```text
x ^ 0 = x
```

Therefore:

```text
1 ^ 2 ^ 3 ^ 2 ^ 1
```

becomes:

```text
0 ^ 3
```

which is:

```text
3
```

Matching numbers cancel each other.

---

# ⭐ XOR Idea

XOR:

```text
All numbers from 0 to n
```

with:

```text
All numbers present in the array
```

Every number that appears in both groups cancels.

Only the missing number remains.

---

# Example

Array:

```text
[3,0,1]
```

Expected:

```text
0,1,2,3
```

XOR everything:

```text
0 ^ 1 ^ 2 ^ 3
```

XOR array:

```text
3 ^ 0 ^ 1
```

Common values cancel:

```text
0
1
3
```

Only:

```text
2
```

remains.

---

# 🎯 Pattern

When you see:

```text
Missing number
Every number appears once
One value is absent
```

consider:

```text
XOR
```

especially when O(1) extra space is required.

---

# ⭐ Key Takeaways

```text
x ^ x = 0
x ^ 0 = x
```

Duplicates cancel.

The missing number remains.

### Optimal:

```text
Time  : O(n)
Space : O(1)
```
