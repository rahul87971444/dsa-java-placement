# 🚀 Merge Sorted Array (LeetCode 88)

Merge two sorted arrays into one sorted array.

---

# 📌 Problem Statement

You are given two sorted arrays.

nums1 has enough extra space to hold nums2.

Merge nums2 into nums1 in sorted order.

---

## Example

Input

nums1

```
[1,2,3,0,0,0]
```

m = 3

nums2

```
[2,5,6]
```

n = 3

Output

```
[1,2,2,3,5,6]
```

---

# 🎯 Learning Objectives

- Two Pointer
- Reverse Traversal
- In-place Modification
- Space Optimization

---

# 🧠 Observation

If we start filling from the beginning,

existing numbers get overwritten.

Instead,

fill the array from the END.

---

# ❌ Why Front Traversal Fails?

Suppose

```
nums1

1 2 3 0 0 0

nums2

2 5 6
```

If we insert

```
2
```

at index 1,

```
3
```

gets overwritten.

We lose data.

---

# ✅ Why Backward Traversal Works?

Extra space exists only at the END.

So we compare

Largest element of nums1

Largest element of nums2

Put the larger one at the END.

Nothing gets overwritten.

---

# 🌍 Real-Life Example

Imagine arranging books on a shelf.

Empty spaces are available only at the end.

Naturally,

you place the largest books first from the right.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Copy + Sort | O((m+n) log(m+n)) | O(1) |
| Extra Array | O(m+n) | O(m+n) |
| Two Pointer | O(m+n) | O(1) |

---

# 🔍 Dry Run

nums1

```
1 2 3 0 0 0
```

nums2

```
2 5 6
```

Compare

```
3 vs 6

↓

6
```

Compare

```
3 vs 5

↓

5
```

Compare

```
3 vs 2

↓

3
```

Compare

```
2 vs 2

↓

2
```

Remaining

```
2

1
```

Final

```
1 2 2 3 5 6
```

---

# 💡 Why This Works

The largest element always belongs at the last empty position.

Once placed,

that position never changes.

This guarantees a correct merge.

---

# ⭐ Key Takeaways

✔ Two Pointer

✔ Reverse Traversal

✔ O(m+n)

✔ O(1) Space
