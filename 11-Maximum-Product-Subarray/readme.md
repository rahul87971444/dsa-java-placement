# 🚀 Maximum Product Subarray (LeetCode 152)

Find the contiguous subarray with the maximum product.

---

# 📌 Problem Statement

Given an integer array, return the maximum product of any contiguous subarray.

---

## Example

Input

```
[2,3,-2,4]
```

Output

```
6
```

Explanation

```
2 × 3 = 6
```

---

# 🎯 Learning Objectives

- Prefix Product
- Suffix Product
- Handling Negative Numbers
- Zero Handling

---

# 🧠 Observation

Unlike Maximum Sum,

negative numbers can become positive when multiplied.

Example

```
-2 × -3 = 6
```

Therefore,

tracking only one running product is not enough.

---

# 💡 Key Idea

Maintain

```
Maximum Product

Minimum Product
```

Why minimum?

Because

```
Negative × Negative

↓

Positive
```

Today's minimum product can become tomorrow's maximum product.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Dynamic Programming | O(n) | O(1) |

---

# 🌍 Real-Life Example

Imagine profits and losses.

```
Profit × Profit

↓

Higher Profit
```

But

```
Loss × Loss

↓

Profit
```

A big loss today may become a big gain tomorrow when multiplied by another negative value.

---

# ⭐ Key Takeaways

✔ Track Maximum

✔ Track Minimum

✔ Negative Numbers Matter
