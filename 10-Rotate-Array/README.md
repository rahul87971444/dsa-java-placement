# 🚀 Rotate Array (LeetCode 189)

Rotate an array to the right by k positions.

---

# 📌 Problem Statement

Given an integer array and an integer k,

rotate the array to the right.

---

## Example

Input

```
nums = [1,2,3,4,5,6,7]

k = 3
```

Output

```
[5,6,7,1,2,3,4]
```

---

# 🎯 Learning Objectives

- Reverse Technique
- Two Pointer
- Array Rotation

---

# 🧠 Observation

Instead of moving elements one by one,

reverse parts of the array.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Rotate One by One | O(n × k) | O(1) |
| Extra Array | O(n) | O(n) |
| Reverse Algorithm | O(n) | O(1) |

---

# 💡 Why Reverse Works?

Rotate by

```
3
```

Original

```
1 2 3 4 5 6 7
```

Reverse whole array

```
7 6 5 4 3 2 1
```

Reverse first

```
3
```

elements

```
5 6 7 4 3 2 1
```

Reverse remaining

```
5 6 7 1 2 3 4
```

Done.

---

# ⭐ Key Takeaways

✔ Reverse

✔ Two Pointer

✔ O(n)
