# 🪟 Longest Substring Without Repeating Characters — LeetCode 3

Find the length of the longest substring containing no repeating characters.

---

## 📌 Problem Statement

Given a String `s`, find the length of the longest substring without duplicate characters.

### Example

Input:

```text
abcabcbb
```

Output:

```text
3
```

Because:

```text
abc
```

is the longest substring without repeating characters.

---

## ⚠️ Substring Means Continuous

For:

```text
abcabcbb
```

Valid substrings include:

```text
abc
bca
cab
```

We cannot randomly pick characters from different positions.

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Generate Substrings | O(n²) or worse depending on duplicate checking | O(n) |
| Sliding Window + HashSet | O(n) average | O(n) |

---

# 🧠 What is a Sliding Window?

Imagine selecting part of the String using two pointers:

```text
left
 ↓
a b c a b c b b
    ↑
   right
```

The portion between:

```text
left → right
```

is our current:

```text
WINDOW
```

We maintain one rule:

```text
No Duplicate Characters Inside Window
```

---

# ⚡ Main Idea

Use:

```text
left
right
HashSet
```

`right` expands the window.

If the new character is unique:

```text
Expand →
```

If a duplicate appears:

```text
← Shrink from left
```

until the duplicate disappears.

---

# 🔍 Dry Run

Input:

```text
abcabcbb
```

Start:

```text
Window = ""
```

---

### Add `a`

```text
[a]
```

Length:

```text
1
```

---

### Add `b`

```text
[a b]
```

Length:

```text
2
```

---

### Add `c`

```text
[a b c]
```

Length:

```text
3
```

Maximum:

```text
3
```

---

### Next character = `a`

But:

```text
a
```

already exists.

Current window:

```text
[a b c]
```

Remove from left until `a` is no longer present.

Remove:

```text
a
```

Window:

```text
[b c]
```

Now add new `a`:

```text
[b c a]
```

Still length:

```text
3
```

---

# 🎯 Sliding Window Rule

```text
Unique?
   ↓ YES
Expand Right

Duplicate?
   ↓ YES
Shrink Left
```

---

# 🧠 Window Length Formula

If:

```text
left = 2
right = 5
```

indices are:

```text
2 3 4 5
```

Number of elements:

```text
5 - 2 + 1
= 4
```

Therefore:

```java
right - left + 1
```

is the current window length.

---

# ⭐ Pattern Recognition

When the question contains:

```text
Longest substring
Shortest substring
Continuous segment
At most K
Without repeating
```

think:

```text
Sliding Window
```

especially when you need to maintain a condition over a continuous range.

---

# ⭐ Key Takeaways

- Window represents a continuous portion.
- Right pointer expands.
- Left pointer shrinks.
- HashSet detects duplicates.
- Keep the window valid.
- Time Complexity: O(n) average.
