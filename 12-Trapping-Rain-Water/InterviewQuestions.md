# Trapping Rain Water

---

## Q1. Brute Force?

For every bar,

find the maximum height on the left and right.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

## Q2. Better?

Precompute

```
LeftMax

RightMax
```

arrays.

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

Two Pointer.

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

```
min(leftMax,rightMax)
```

Because water spills over the shorter wall.

Example

```
Left = 7

Right = 4
```

Maximum water level

```
4
```

The taller wall cannot hold more water by itself.

---

## Q5. Why move the smaller pointer?

The trapped water depends on the smaller boundary.

Moving the taller boundary cannot increase the water level until the smaller boundary changes.

---

## Q6. Pattern Used

```
Left Maximum

+

Right Maximum

↓

Two Pointer
```

---

## Q7. Edge Cases

```
Empty Array

↓

0
```

```
One Bar

↓

0
```

```
Increasing Heights

↓

0
```

---

## Q8. Common Mistakes

❌ Using `max()` instead of `min()`.

❌ Forgetting to subtract the current height.

❌ Moving the wrong pointer.

---

## Q9. Interview Discussion

**Interviewer:**

Why don't we move the larger pointer?

**Answer:**

Because the smaller boundary limits the water level.

Changing only the larger boundary cannot increase trapped water until the smaller side changes.

---

## Q10. How to Recognize This Pattern?

Question contains

```
Rain

Water

Height

Elevation

Buildings
```

Think

```
Left Max

Right Max

↓

Two Pointer
```

---

## Q11. One-Line Revision

```
Water Level

↓

Smaller Wall

↓

Subtract Current Height
```
