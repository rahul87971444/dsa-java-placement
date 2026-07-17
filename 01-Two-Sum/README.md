# 🔥 Two Sum | LeetCode 1

The **Two Sum** problem is one of the most frequently asked coding interview questions. It teaches the use of **HashMap**, a fundamental data structure for optimizing search operations.

---

# 📌 Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Example

### Input

```text
nums = [2, 7, 11, 15]

target = 9
```

### Output

```text
[0, 1]
```

### Explanation

```
nums[0] + nums[1]

2 + 7 = 9
```

---

# 🎯 Learning Objectives

After solving this problem, you will understand:

- Arrays
- HashMap
- Brute Force
- Optimization
- Time Complexity
- Space Complexity
- Complement Technique

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| HashMap | O(n) | O(n) |

---

# 🧠 Algorithm (Brute Force)

1. Pick the first element.
2. Compare it with every remaining element.
3. Check whether their sum equals the target.
4. Return the indices.

---

# ⚡ Algorithm (Optimal - HashMap)

1. Create an empty HashMap.
2. Traverse the array.
3. Calculate:

```
Need = Target - Current Number
```

4. Check whether the required number already exists inside the HashMap.
5. If yes, return the answer.
6. Otherwise store the current number and its index.

---

# 🔍 Dry Run

Input

```text
nums = [2,7,11,15]

target = 9
```

### Iteration 1

Current Number

```
2
```

Need

```
7
```

HashMap

```
2 → 0
```

---

### Iteration 2

Current Number

```
7
```

Need

```
2
```

HashMap already contains

```
2
```

Answer

```
0 1
```

---

# 🌍 Real-Life Example

Imagine you have ₹9 to spend.

You see the following prices:

```
₹2

₹7

₹11

₹15
```

You immediately notice

```
₹2 + ₹7 = ₹9
```

The HashMap remembers previously seen prices, making the search much faster.

---

# ⏱ Complexity Analysis

## Brute Force

Time Complexity

```
O(n²)
```

Space Complexity

```
O(1)
```

---

## Optimal

Time Complexity

```
O(n)
```

Space Complexity

```
O(n)
```

---

# 💼 Companies Asking This Question

- Google
- Amazon
- Microsoft
- Meta
- Apple
- Adobe
- Oracle
- TCS Prime
- Infosys
- Accenture
- Capgemini
- Cognizant

---

# 📚 Similar Problems

- Two Sum II
- Three Sum
- Four Sum
- Contains Duplicate
- Intersection of Arrays
- Pair Sum
- Target Sum

---

# ⭐ Key Takeaways

✔ Learn HashMap.

✔ Understand Complement Technique.

✔ Know Brute Force and Optimal solution.

✔ Explain Time Complexity confidently.

✔ One of the most asked interview questions.
