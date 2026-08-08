# 🪟 Minimum Size Subarray Sum — LeetCode 209

Find the minimum length of a contiguous subarray whose sum is greater than or equal to a given target.

---

# 📌 Problem Statement

Given:

```text
target = 7

nums = [2,3,1,2,4,3]
```

Find the smallest contiguous subarray whose sum is at least 7.

---

## Answer

```text
2
```

Because:

```text
4 + 3 = 7
```

The subarray:

```text
[4,3]
```

has length:

```text
2
```

---

# ⚠️ Important

The array contains positive integers.

This is important because when we move the right pointer:

```text
sum increases
```

and when we move the left pointer:

```text
sum decreases
```

This property allows the Sliding Window technique.

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Brute Force | O(n²) | O(1) |
| Prefix Sum + Binary Search | O(n log n) | O(n) |
| Sliding Window | O(n) | O(1) |

---

# 🧠 Sliding Window Idea

We maintain:

```text
left
right
currentSum
```

The window is:

```text
[left ... right]
```

---

# ⚡ Algorithm

### Step 1

Move `right` forward.

Add:

```text
nums[right]
```

to the sum.

### Step 2

When:

```text
sum >= target
```

the window is valid.

### Step 3

Try to make it smaller.

Move:

```text
left++
```

and subtract the removed value.

### Step 4

Keep the minimum window length.

---

# 🔍 Dry Run

Target:

```text
7
```

Array:

```text
2 3 1 2 4 3
```

---

### Add 2

```text
sum = 2
```

Not enough.

---

### Add 3

```text
sum = 5
```

Not enough.

---

### Add 1

```text
sum = 6
```

Not enough.

---

### Add 2

```text
sum = 8
```

Now:

```text
8 >= 7
```

Valid window:

```text
[2,3,1,2]
```

Length:

```text
4
```

---

## Now Shrink

Remove first `2`.

```text
sum = 6
```

Now:

```text
6 < 7
```

Stop shrinking.

---

### Continue

Add `4`:

```text
sum = 10
```

Valid window:

```text
[3,1,2,4]
```

Length:

```text
4
```

Shrink:

```text
remove 3

sum = 7
```

Window:

```text
[1,2,4]
```

Length:

```text
3
```

Shrink:

```text
remove 1

sum = 6
```

Stop.

---

### Add 3

```text
sum = 9
```

Window:

```text
[2,4,3]
```

Length:

```text
3
```

Shrink:

```text
remove 2

sum = 7
```

Window:

```text
[4,3]
```

Length:

```text
2
```

Shrink:

```text
remove 4

sum = 3
```

Stop.

Final:

```text
2
```

---

# 🎯 Sliding Window Pattern

Here we have:

```text
Variable Size Window
```

The window:

```text
EXPANDS
```

until the condition becomes true.

Then:

```text
SHRINKS
```

while the condition remains true.

---

# 🧠 Memory Trick

For a minimum window:

```text
Expand → Satisfy → Shrink
```

For a maximum window:

```text
Expand → Keep Valid → Update Maximum
```

---

# ⭐ Pattern Recognition

If the question asks:

```text
Minimum subarray
Maximum subarray
Longest substring
Shortest substring
Contiguous range
Target sum
At least K
At most K
```

ask yourself:

```text
Can I maintain a window?
```

If the values/properties allow the window to be adjusted predictably, Sliding Window may work.

---

# ⭐ Key Takeaways

- Window is `[left...right]`.
- Right expands.
- When sum becomes large enough, left shrinks.
- Update the answer while the window is valid.
- Positive numbers make this approach work.
- Time Complexity: O(n).
- Space Complexity: O(1).
