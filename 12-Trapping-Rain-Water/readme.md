# 🚀 Trapping Rain Water (LeetCode 42)

One of the most famous Two Pointer interview questions.

---

# 📌 Problem Statement

Given an array representing bar heights,

calculate how much rainwater can be trapped.

---

## Example

Input

```
[0,1,0,2,1,0,1,3,2,1,2,1]
```

Output

```
6
```

---

# 🌍 Real-Life Example

Imagine buildings after rain.

```
█     █

█ █   █

█ █ █ █
```

Water gets trapped between taller buildings.

---

# 🎯 Learning Objectives

- Prefix Maximum
- Suffix Maximum
- Two Pointer
- Greedy Thinking

---

# 🧠 Observation

Water above a bar depends on

```
Minimum

of

Left Maximum

Right Maximum
```

Formula

```
Water

=

min(leftMax,rightMax)

-

Current Height
```

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Prefix & Suffix Arrays | O(n) | O(n) |
| Two Pointer | O(n) | O(1) |

---

# ⭐ Key Formula

```
Water

=

min(LeftMax,RightMax)

-

Height
```
