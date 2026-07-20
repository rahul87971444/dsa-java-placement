# 🚀 Move Zeroes | LeetCode 283

Move all zeros to the end while maintaining the relative order of non-zero elements.

---

# 📌 Problem Statement

Given an integer array, move all zeros to the end without changing the order of the remaining elements.

---

## Example

Input

```
[0,1,0,3,12]
```

Output

```
[1,3,12,0,0]
```

---

# 🎯 Learning Objectives

- Two Pointer Technique
- In-place Array Modification
- Array Traversal

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Extra Array | O(n) | O(n) |
| Two Pointer | O(n) | O(1) |

---

# 🧠 Algorithm (Two Pointer)

1. Keep one pointer for placing non-zero elements.
2. Traverse the array.
3. If current element is non-zero, swap it with the position indicated by the pointer.
4. Increment the pointer.
5. Zeros automatically move to the end.

---

# 🔍 Dry Run

Input

```
0 1 0 3 12
```

After processing

```
1 3 12 0 0
```

---

# 🌍 Real-Life Example

Imagine arranging students in a line.

Students present

```
1 3 12
```

Absent students

```
0
```

Move all absent students to the end while keeping the order of present students unchanged.

---

# ⏱ Complexity

Time

```
O(n)
```

Space

```
O(1)
```

---

# ⭐ Key Takeaways

✔ Two Pointer Pattern

✔ In-place Algorithm

✔ Stable Ordering
