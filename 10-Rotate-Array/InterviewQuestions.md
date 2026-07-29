# Rotate Array

---

## Q1. Brute Force?

Rotate one step

↓

Repeat k times.

### Time Complexity

```
O(n × k)
```

### Space Complexity

```
O(1)
```

---

## Q2. Better?

Extra Array.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Optimal?

Reverse Algorithm.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q4. Why

```java
k %= n;
```

Because rotating more than n times repeats the same arrangement.

---

## Q5. Why reverse three times?

1.

Whole array.

2.

First k elements.

3.

Remaining elements.

This recreates the rotated order without extra space.

---

## Q6. Pattern Used

```
Reverse

↓

Two Pointer
```

---

## Edge Cases

```
k = 0
```

No rotation.

---

```
k > n
```

Use

```
k %= n
```

---

## Common Mistakes

❌ Forgetting

```java
k %= n;
```

❌ Wrong reverse ranges.

---

## Interview Discussion

Interviewer:

Can you solve without extra array?

Answer:

Yes.

Using the reverse algorithm.

Time

```
O(n)
```

Space

```
O(1)
```
