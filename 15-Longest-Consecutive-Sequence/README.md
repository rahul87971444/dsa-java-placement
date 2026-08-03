# 🔥 Longest Consecutive Sequence — LeetCode 128

Find the length of the longest sequence of consecutive integers in an unsorted array.

---

## 📌 Problem Statement

Given an unsorted integer array `nums`, return the length of the longest consecutive elements sequence.

The numbers must be consecutive by VALUE.

They do NOT need to be consecutive in the original array.

---

## Example 1

Input:

```text
[100,4,200,1,3,2]
```

Output:

```text
4
```

Because:

```text
1 → 2 → 3 → 4
```

has length:

```text
4
```

---

## Example 2

Input:

```text
[0,3,7,2,5,8,4,6,0,1]
```

Output:

```text
9
```

Sequence:

```text
0 1 2 3 4 5 6 7 8
```

Length:

```text
9
```

---

# 🧠 First Important Observation

The array is:

```text
UNSORTED
```

Example:

```text
100 4 200 1 3 2
```

But we care about values:

```text
1 2 3 4
```

not their original positions.

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Brute Force Search | O(n²) | O(1) |
| Sorting | O(n log n) | Depends on sorting |
| HashSet | O(n) average | O(n) |

---

# ❌ Brute Force Idea

For every number:

```text
x
```

search whether:

```text
x + 1
```

exists.

Then:

```text
x + 2
```

Then:

```text
x + 3
```

and so on.

Searching the entire array repeatedly makes this expensive.

---

# 🟡 Better Approach — Sorting

Sort:

```text
[100,4,200,1,3,2]
```

becomes:

```text
[1,2,3,4,100,200]
```

Now count consecutive values.

Longest:

```text
1 2 3 4
```

Length:

```text
4
```

### Complexity

```text
Time  : O(n log n)
Space : Depends on sorting implementation
```

---

# ⚡ Optimal Approach — HashSet

Put every number inside a HashSet.

Example:

```text
{100,4,200,1,3,2}
```

Now checking:

```text
Does 2 exist?
Does 3 exist?
Does 4 exist?
```

takes O(1) average time per lookup.

But there is one VERY important optimization.

---

# 🔥 The Sequence Start Trick

Suppose:

```text
1 2 3 4
```

Should we start counting from:

```text
1?
2?
3?
4?
```

Only:

```text
1
```

Why?

Because `1` has no previous number:

```text
0
```

in the set.

Therefore:

```text
1
```

is the beginning of the sequence.

---

# ⭐ Key Condition

```java
if (!set.contains(num - 1))
```

means:

> Start counting only if there is no previous consecutive number.

---

# 🧠 Example

Set:

```text
1 2 3 4 100 200
```

Check:

```text
num = 1
```

Does:

```text
0
```

exist?

```text
NO
```

Therefore:

```text
1 is a sequence START
```

Count:

```text
1 → 2 → 3 → 4
```

Length:

```text
4
```

---

Now:

```text
num = 2
```

Does:

```text
1
```

exist?

```text
YES
```

Therefore:

```text
2 is NOT a sequence start
```

Skip it.

Same for:

```text
3
4
```

This prevents us from counting the same sequence repeatedly.

---

# 🔍 Dry Run

Input:

```text
[100,4,200,1,3,2]
```

HashSet:

```text
{100,4,200,1,3,2}
```

---

### num = 100

Check:

```text
99 exists?
```

No.

Start sequence:

```text
100
```

Length:

```text
1
```

---

### num = 4

Check:

```text
3 exists?
```

Yes.

Therefore:

```text
4 is not the start
```

Skip.

---

### num = 200

Check:

```text
199 exists?
```

No.

Sequence:

```text
200
```

Length:

```text
1
```

---

### num = 1

Check:

```text
0 exists?
```

No.

Start counting:

```text
1
```

Next:

```text
2 ✓
3 ✓
4 ✓
5 ✗
```

Length:

```text
4
```

Maximum:

```text
4
```

---

# 🎯 Pattern

```text
Need Fast Existence Check
        ↓
      HashSet

Consecutive Sequence
        ↓
Find Sequence Start
        ↓
Check num - 1
```

---

# ⭐ Key Takeaways

- HashSet provides O(1) average lookup.
- Start counting only from sequence beginnings.
- `num - 1` tells us whether `num` is a beginning.
- Each sequence is processed only once.
- Average Time: O(n)
- Space: O(n)
