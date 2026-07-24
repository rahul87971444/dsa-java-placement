# 🚀 Maximum Subarray (Kadane's Algorithm)

LeetCode 53

One of the Top 10 most asked array interview questions.

---

# 📌 Problem Statement

Given an integer array, find the contiguous subarray that has the largest sum and return that sum.

A subarray must contain contiguous elements.

---

## Example

Input

```text
[-2,1,-3,4,-1,2,1,-5,4]
```

Output

```text
6
```

Explanation

Largest Subarray

```text
4 -1 2 1
```

Sum

```text
6
```

---

# 🎯 Learning Objectives

- Brute Force
- Prefix Thinking
- Kadane's Algorithm
- Running Sum
- Running Maximum

---

# 🧠 Observation

A negative running sum will never help us increase a future answer.

If the running sum becomes negative,

Throw it away.

Start a new subarray.

---

# 🌍 Real-Life Example

Imagine you're walking and collecting money.

Positive number

```
Earn Money
```

Negative number

```
Lose Money
```

Suppose

```
+10

-15

+20
```

Would you carry

```
-5
```

forward?

No.

You would simply start again from

```
20
```

Exactly what Kadane's Algorithm does.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n³) | O(1) |
| Better | O(n²) | O(1) |
| Kadane | O(n) | O(1) |

---

# 💡 Why Kadane Works

Whenever the current sum becomes negative,

Keeping it will only reduce future sums.

So discard it.

Start a fresh subarray.

---

# 🔍 Dry Run

Input

```text
-2 1 -3 4 -1 2 1 -5 4
```

| Element | Current Sum | Max Sum |
|---------|------------:|---------:|
| -2 | -2 → 0 | -2 |
| 1 | 1 | 1 |
| -3 | -2 → 0 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Final Answer

```
6
```



# ⭐ Key Takeaways

✔ Running Sum

✔ Running Maximum

✔ Reset Negative Sum

✔ O(n) Solution
