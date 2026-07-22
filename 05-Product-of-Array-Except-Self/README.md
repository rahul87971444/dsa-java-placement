# 🚀 Product of Array Except Self | LeetCode 238

One of the most important array interview questions.

---

# 📌 Problem Statement

Given an integer array, return an array where each element is equal to the product of all other elements except itself.

**Do not use division.**

---

## Example

Input

```
[1,2,3,4]
```

Output

```
[24,12,8,6]
```

Explanation

```
24 = 2×3×4

12 = 1×3×4

8 = 1×2×4

6 = 1×2×3
```

---

# 🎯 Learning Objectives

- Prefix Product
- Suffix Product
- Space Optimization
- Interview Optimization

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Prefix + Suffix | O(n) | O(n) |
| Optimized | O(n) | O(1)* |

(*excluding output array)

---

# 🧠 Pattern

```
Prefix

↓

Suffix

↓

Combine
```

---

# 🌍 Real-Life Example

Imagine multiplying everyone's salary except your own.

Instead of multiplying everything repeatedly, store the product from the left and the product from the right separately.

---

# ⭐ Key Takeaways

✔ Prefix Product

✔ Suffix Product

✔ Space Optimization

✔ No Division
