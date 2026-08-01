# 🌊 Container With Most Water — LeetCode 11

Find two vertical lines that together with the x-axis form a container holding the maximum amount of water.

---

## 📌 Problem Statement

Given:

```text
height = [1,8,6,2,5,4,8,3,7]
```

Find the maximum amount of water.

### Output

```text
49
```

---

# 🧠 Formula

Water depends on:

```text
Width × Height
```

But container height is limited by the shorter wall.

Therefore:

```text
Area = min(height[left], height[right])
       ×
       (right - left)
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Brute Force | O(n²) | O(1) |
| Two Pointer | O(n) | O(1) |

---

# ❌ Brute Force Idea

Try every possible pair.

For every:

```text
i
```

try every:

```text
j
```

Calculate the area.

This works but takes:

```text
O(n²)
```

---

# ⚡ Optimal Idea

Place:

```text
left = beginning

right = end
```

Calculate the current area.

Then move the pointer having the shorter wall.

---

# 🔥 Why Move the Shorter Wall?

Suppose:

```text
Left Height  = 2

Right Height = 8
```

Water height is:

```text
min(2,8)

= 2
```

The left wall is limiting us.

If we move the right wall:

```text
Width decreases
```

but the height is still limited by:

```text
2
```

So we cannot improve because of the same short wall.

Instead, move the shorter wall.

Maybe we find:

```text
Left Height = 7
```

Now a larger area becomes possible.

---

# 🔍 Example

```text
height = [1,8,6,2,5,4,8,3,7]
```

Start:

```text
L                               R
1  8  6  2  5  4  8  3  7
```

Area:

```text
min(1,7) × 8

= 8
```

Left is shorter.

Move left.

Now:

```text
   L                            R
1  8  6  2  5  4  8  3  7
```

Area:

```text
min(8,7) × 7

= 7 × 7

= 49
```

Maximum becomes:

```text
49
```

---

# 🎯 Pattern

```text
Two Ends
   ↓
Compare Both
   ↓
Move Limiting Pointer
   ↓
Two Pointer
```

---

# ⭐ Key Takeaways

- Start from maximum possible width.
- Area uses the shorter wall.
- Move the shorter wall.
- Keep the maximum area.
- Time O(n), Space O(1).
