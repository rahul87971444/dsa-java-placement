# Maximum Product Subarray

---

## Q1. Brute Force?

Generate every subarray.

Calculate every product.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

## Q2. Optimal?

Dynamic Programming.

Track

```
Maximum Product

Minimum Product
```

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q3. Why keep the minimum product?

Example

```
Current Minimum

-6

Current Number

-2
```

Multiply

```
-6 × -2

↓

12
```

The minimum product suddenly becomes the maximum.

---

## Q4. Why swap

```java
maxProduct

minProduct
```

when the current number is negative?

A negative number reverses the sign.

The previous maximum may become the minimum,

and the previous minimum may become the maximum.

---

## Q5. Pattern Used

```
Running Maximum

+

Running Minimum
```

---

## Q6. Edge Cases

```
Single Element

↓

Return that element.
```

```
Contains Zero

↓

Restart product.
```

---

## Q7. Common Mistakes

❌ Tracking only the maximum product.

❌ Forgetting to swap on negative numbers.

---

## Q8. Similar Questions

- Kadane's Algorithm
- Maximum Sum Subarray
- Product Except Self

---

## Q9. Interview Discussion

Interviewer:

Why can't Kadane's Algorithm be used directly?

Answer:

Kadane works with addition.

Products behave differently because multiplying by a negative number changes the sign.

Therefore, we must track both the maximum and minimum products.

---

## Q10. How to Recognize This Pattern?

Question contains

```
Maximum Product

Negative Numbers

Contiguous
```

Think

```
Running Max

+

Running Min
```

---

## Q11. One-Line Revision

```
Negative Changes Sign

↓

Track Max & Min

↓

Update Answer
```
