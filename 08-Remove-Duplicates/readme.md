# 🚀 Remove Duplicates from Sorted Array (LeetCode 26)

One of the most common Two Pointer interview questions.

---

# 📌 Problem Statement

Given a sorted array, remove duplicates in-place such that each unique element appears only once.

Return the number of unique elements.

---

## Example

Input

```text
[1,1,2]
```

Output

```text
Length = 2

Array = [1,2,_]
```

---

## Example

Input

```text
[0,0,1,1,1,2,2,3,3,4]
```

Output

```text
Length = 5

Array = [0,1,2,3,4]
```

---

# 🎯 Learning Objectives

- Two Pointer
- In-place Modification
- Sorted Arrays

---

# 🧠 Observation

Since the array is already sorted,

duplicates always appear next to each other.

We only need to compare the current element with the last unique element.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| HashSet | O(n) | O(n) |
| Two Pointer | O(n) | O(1) |

---

# 🌍 Real-Life Example

Attendance Register

```
101

101

102

102

103
```

Final Register

```
101

102

103
```

---

# 💡 Why Two Pointer Works

One pointer stores the last unique element.

The second pointer scans the array.

Whenever a new value appears,

store it after the previous unique value.

---

# 🔍 Dry Run

Input

```
1 1 2 2 3
```

Unique Pointer

```
1
```

↓

Skip duplicate

↓

Store

```
2
```

↓

Store

```
3
```

Final

```
1 2 3
```

---

# ⭐ Key Takeaways

✔ Sorted Array

✔ Two Pointer

✔ In-place Modification
