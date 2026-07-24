# Maximum Subarray (Kadane's Algorithm)

---

## Q1. What is the brute force approach?

Generate every possible subarray.

Find the sum.

Keep the largest sum.

### Time Complexity

```
O(n³)
```

### Space Complexity

```
O(1)
```

---

## Q2. Can we improve brute force?

Yes.

Instead of recalculating every subarray sum,

keep adding elements.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

## Q3. What is Kadane's Algorithm?

Maintain two variables:

```
Current Sum

Maximum Sum
```

Discard the current sum whenever it becomes negative.

---

## Q4. Why do we reset

```java
currentSum = 0;
```

Suppose

```
Current Sum = -10
```

Next element

```
20
```

Two choices

```
-10 + 20 = 10
```

or

```
20
```

Which is larger?

```
20
```

Negative sums only decrease future sums.

Hence

```
Reset to 0
```

---

## Q5. Why initialize

```java
maxSum = arr[0];
```

instead of

```java
0
```

Consider

```
-8 -2 -10
```

Largest sum

```
-2
```

If

```java
maxSum = 0;
```

Answer becomes

```
0
```

which is incorrect.

---

## Q6. Time Complexity of Each Approach

### Brute Force

```
Time : O(n³)

Space : O(1)
```

### Better

```
Time : O(n²)

Space : O(1)
```

### Kadane

```
Time : O(n)

Space : O(1)
```

---

## Q7. Why is Kadane optimal?

Every element is visited exactly once.

No nested loops.

---

## Q8. Which pattern is used?

```
Running Sum

↓

Running Maximum
```

---

## Q9. Similar Problems

- Maximum Product Subarray
- Circular Subarray Sum
- Stock Buy and Sell
- Maximum Difference

---

## Q10. Common Mistakes

❌

```java
maxSum = 0;
```

Fails for

```
All Negative Arrays
```

---

## Q11. Interview Follow-up

Interviewer

"Can you also return the subarray?"

Answer

Yes.

Store

```
Start Index

End Index
```

while updating Kadane.

---

## Q12. One-Line Revision

```
Running Sum

↓

Negative?

↓

Discard

↓

Continue
```
