# 🔥 3Sum — LeetCode 15

Find all unique triplets whose sum equals zero.

---

## 📌 Problem Statement

Given an integer array `nums`, return all unique triplets:

```text
[a, b, c]
```

such that:

```text
a + b + c = 0
```

---

## Example

Input:

```text
[-1,0,1,2,-1,-4]
```

Output:

```text
[[-1,-1,2],[-1,0,1]]
```

---

# 🧠 Connection With Two Sum

We already know:

```text
Two Sum

a + b = target
```

3Sum asks:

```text
a + b + c = 0
```

Fix one number:

```text
a
```

Now:

```text
b + c = -a
```

The remaining problem becomes:

```text
Two Sum
```

🔥 This is the main idea.

---

# 🚀 Approaches

| Approach | Time | Extra Space |
|---|---:|---:|
| Triple Loop | O(n³) | O(1)* |
| HashSet | O(n²) | O(n) |
| Sorting + Two Pointer | O(n²) | O(1)* |

`*` excluding the returned result and implementation-dependent sorting space.

---

# ⚡ Optimal Strategy

```text
Sort
 ↓
Fix One Element
 ↓
Two Pointer on Remaining Array
 ↓
Skip Duplicates
```

---

# 🔍 Example

Input:

```text
[-1,0,1,2,-1,-4]
```

Sort:

```text
[-4,-1,-1,0,1,2]
```

Fix:

```text
-1
```

We need:

```text
b + c = 1
```

Choose:

```text
-1 + 2 = 1
```

Therefore:

```text
-1 + -1 + 2 = 0
```

Triplet:

```text
[-1,-1,2]
```

Another:

```text
-1 + 0 + 1 = 0
```

Triplet:

```text
[-1,0,1]
```

---

# 🧠 Two Pointer Decision

Calculate:

```text
sum = nums[i] + nums[left] + nums[right]
```

If:

```text
sum < 0
```

we need a larger sum.

Move:

```text
left++
```

If:

```text
sum > 0
```

we need a smaller sum.

Move:

```text
right--
```

If:

```text
sum == 0
```

we found a triplet.

---

# ⭐ Why Sorting Matters

Sorting allows us to know which direction changes the sum.

```text
Need larger value
→ move LEFT rightward

Need smaller value
→ move RIGHT leftward
```

It also makes duplicate removal easier.

---

# 🎯 Pattern

```text
3Sum
 ↓
Fix One
 ↓
Reduce to Two Sum
 ↓
Two Pointer
```
