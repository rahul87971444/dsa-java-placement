# Majority Element - Interview Questions

---

## Q1. What is the brute-force approach?

Count the frequency of every element.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

## Q2. Better approach?

HashMap Frequency Count.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Optimal approach?

Boyer-Moore Voting Algorithm.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q4. Why does Boyer-Moore work?

The majority element appears more than half the time.

Every time a majority element meets a different element,

they cancel each other.

Since the majority element has more occurrences,

it is the last candidate remaining.

---

## Q5. Explain

```java
if(count==0)
    candidate=num;
```

When the count becomes zero,

the previous candidate has been completely cancelled.

So,

choose the current number as the new candidate.

---

## Q6. Explain

```java
count++;
```

If the current element equals the candidate,

increase confidence in that candidate.

---

## Q7. Explain

```java
count--;
```

Different element

↓

One vote cancelled.

---

## Q8. Pattern Used

```
Voting

↓

Cancellation

↓

Candidate
```

---

## Q9. Similar Problems

- Majority Element II

- Find Duplicate

- Frequency Count

---

## Q10. Common Mistakes

❌ Thinking Boyer-Moore works without a guaranteed majority.

If a majority is **not guaranteed**, a second pass is required to verify the candidate.

---

## Q11. Interview Discussion

**Interviewer:**

Why doesn't the majority element disappear?

**Answer:**

Because it appears more than **n/2** times.

Even after cancelling one majority vote with one non-majority vote repeatedly, the majority element still has votes left and becomes the final candidate.

---

## Q12. One-Line Revision

```
Majority

↓

Cancel Different Votes

↓

Remaining Candidate Wins
```
