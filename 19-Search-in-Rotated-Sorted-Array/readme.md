# 🔍 Search in Rotated Sorted Array — LeetCode 33

Given a sorted array that has been rotated, search for a target value.

Return its index if found.

Otherwise return:

```text
-1
```

---

## Example

Original sorted array:

```text
[0,1,2,4,5,6,7]
```

After rotation:

```text
[4,5,6,7,0,1,2]
```

Target:

```text
0
```

Output:

```text
4
```

---

# 🧠 Why is this different from normal Binary Search?

Normal binary search assumes:

```text
Entire array is sorted
```

Here:

```text
[4,5,6,7,0,1,2]
```

is not globally sorted.

But there is an important observation:

> At least one half of the current search range is always sorted.

---

# 🔥 Main Idea

Suppose:

```text
[4,5,6,7,0,1,2]
    L     M     R
```

If:

```text
nums[left] <= nums[mid]
```

then:

```text
left → mid
```

is sorted.

Otherwise:

```text
mid → right
```

is sorted.

---

# Example

```text
4 5 6 7 0 1 2
L     M       R
```

Here:

```text
nums[L] <= nums[M]
```

because:

```text
4 <= 7
```

Therefore:

```text
4 5 6 7
```

is the sorted half.

---

# 🎯 Then Ask

Is the target inside the sorted half?

If yes:

```text
Search there
```

If no:

```text
Discard that half
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Linear Search | O(n) | O(1) |
| Modified Binary Search | O(log n) | O(1) |

---

# 🔥 Algorithm

At every iteration:

```text
Find mid
   ↓
Is left half sorted?
   ↓
YES ───────── NO
 ↓             ↓
Check target   Right half is sorted
range          ↓
 ↓             Check target range
Move pointer   Move pointer
```

---

# Important Condition

If left half is sorted:

```java
nums[left] <= nums[mid]
```

Then target belongs to this half if:

```java
target >= nums[left]
&&
target < nums[mid]
```

Otherwise search right.

---

# If Right Half Is Sorted

When:

```java
nums[left] > nums[mid]
```

the right half is sorted.

Target belongs there if:

```java
target > nums[mid]
&&
target <= nums[right]
```

Otherwise search left.

---

# ⭐ Key Takeaways

- One half is always sorted.
- Identify the sorted half.
- Check whether target belongs to it.
- Discard the impossible half.
- Continue binary search.
- Time: O(log n)
- Space: O(1)
