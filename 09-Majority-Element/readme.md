# 🚀 Majority Element (LeetCode 169)

Find the element that appears more than n/2 times.

---

# 📌 Problem Statement

Given an integer array,

find the majority element.

The majority element always appears more than

```
n/2
```

times.

---

## Example

Input

```
[2,2,1,1,1,2,2]
```

Output

```
2
```

---

# 🎯 Learning Objectives

- Frequency Count

- Boyer-Moore Voting Algorithm

- Candidate Selection

---

# 🧠 Observation

The majority element appears more than half the time.

Therefore,

even if we cancel one majority element with one non-majority element,

the majority element still survives.

This is the key idea behind Boyer-Moore.

---

# 🌍 Real-Life Example

Imagine voting.

Candidate A

```
7 votes
```

Others

```
3 votes
```

Whenever one vote of A cancels one vote of another candidate,

A still has more votes remaining.

Eventually,

A survives.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| HashMap | O(n) | O(n) |
| Boyer-Moore | O(n) | O(1) |

---

# ⭐ Key Takeaways

✔ Voting Algorithm

✔ Candidate

✔ Counter

✔ O(1) Space
