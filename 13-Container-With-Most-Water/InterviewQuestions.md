# Container With Most Water — Interview Questions

## Q1. What is the brute-force approach?

Try every pair of lines.

Calculate:

```text
Area = Width × Minimum Height
```

Keep the maximum.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

## Q2. What is the optimal approach?

Use two pointers.

Start:

```text
left  = 0

right = n - 1
```

Calculate area and move the shorter wall.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

## Q3. Why use Math.min()?

Suppose:

```text
Left Wall  = 10

Right Wall = 6
```

Water can only reach height:

```text
6
```

because it spills over the shorter wall.

Therefore:

```java
Math.min(leftHeight, rightHeight)
```

---

## Q4. Why move the shorter wall?

This is the most important interview question.

Suppose:

```text
Left  = 3

Right = 10
```

Container height:

```text
3
```

The left wall limits the area.

Moving the right wall decreases width but leaves the same limiting wall of height 3.

Therefore, the only chance of finding a larger area is to move the shorter wall and search for a taller one.

---

## Q5. Why start at both ends?

The two ends give us the maximum possible width.

We gradually reduce the width while searching for taller boundaries.

---

## Q6. What is the formula?

```text
Area = (right - left)
       ×
       min(height[left], height[right])
```

---

## Q7. Which pattern is used?

```text
Two Pointer
```

Specifically:

```text
Opposite Direction Two Pointer
```

---

## Q8. Difference from Trapping Rain Water?

Container With Most Water:

```text
Choose TWO lines.
```

Trapping Rain Water:

```text
Calculate water trapped across MANY positions.
```

They look similar but are different problems.

---

## Q9. Can sorting help?

No.

Sorting destroys the original positions.

Width depends on indices:

```text
right - left
```

So positions must remain unchanged.

---

## Q10. Why not use HashMap?

There is no lookup or frequency requirement.

The important information is:

```text
Height + Position
```

Therefore HashMap doesn't help.

---

## Q11. Edge Case — Two Elements

```text
[5,7]
```

Area:

```text
min(5,7) × 1

= 5
```

---

## Q12. Edge Case — Same Heights

```text
[5,5,5,5]
```

The maximum area comes from the two farthest walls.

---

## Q13. Common Mistake

Wrong:

```text
Area = max(left,right) × width
```

Correct:

```text
Area = min(left,right) × width
```

The shorter wall determines the water level.

---

## Q14. Interviewer: Why is it O(n)?

Each pointer moves only inward.

`left` can move at most n times.

`right` can move at most n times.

There are no nested loops.

Therefore:

```text
O(n)
```

---

## Q15. How to Recognize This Pattern?

Look for:

```text
Pair of elements

Maximum/minimum value

Distance between indices

Compare elements from both ends
```

Think:

```text
Two Pointer
```

---

## Q16. One-Line Revision

```text
Area = Width × Shorter Wall

↓

Move Shorter Wall

↓

Keep Maximum
```
