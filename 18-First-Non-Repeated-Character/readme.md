# 🔤 First Non-Repeated Character

Find the first character in a String that occurs exactly once.

## Example

Input:

```text
swiss
```

Frequency:

```text
s → 3
w → 1
i → 1
```

The first character occurring once is:

```text
w
```

Output:

```text
w
```

---

## Another Example

Input:

```text
aabbcdde
```

Frequencies:

```text
a → 2
b → 2
c → 1
d → 2
e → 1
```

Output:

```text
c
```

---

# Approach 1 — Nested Loops

For every character, count how many times it occurs.

Then return the first character whose count is 1.

### Complexity

```text
Time  : O(n²)
Space : O(1)
```

---

# Approach 2 — Frequency Map

First count every character.

Then traverse the String again from left to right.

Return the first character whose frequency is 1.

### Complexity

```text
Time  : O(n)
Space : O(n)
```

---

# Important Idea

We need two different things:

```text
1. Frequency
2. Original order
```

A frequency map gives us the first requirement.

The second traversal of the original String preserves the original order.

---

# Why not simply return the first entry from the Map?

Because a normal HashMap should not be relied upon for insertion order.

We can safely solve the problem by:

```text
Count frequencies
        ↓
Traverse original String
        ↓
Find first frequency = 1
```

---

# Pattern

```text
Count First
    ↓
Scan Again
    ↓
First Frequency = 1
```
