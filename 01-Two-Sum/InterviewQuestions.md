# Two Sum - Interview Questions

---

## Q1. Why is the Brute Force approach slow?

Because it checks every possible pair.

Time Complexity

```
O(n²)
```

---

## Q2. Why do we use HashMap?

HashMap provides average O(1) lookup time, making the solution much faster.

---

## Q3. What is the Complement Technique?

```
Need = Target - Current Number
```

Instead of searching for a pair directly, we search for the required complement.

---

## Q4. Why is the HashMap solution O(n)?

Each element is processed once, and HashMap operations (`put` and `containsKey`) are O(1) on average.

---

## Q5. What happens if duplicate values exist?

The HashMap stores the latest index for a value. The algorithm still works correctly when a valid pair exists.

---

## Q6. Can this be solved without extra space?

Yes, using the Brute Force approach.

---

## Q7. Why can't we sort the array?

Sorting changes the original indices, which the problem asks us to return.

---

## Q8. Which Java collection is used?

HashMap

---

## Q9. Which pattern does this problem belong to?

Hashing Pattern

---

## Q10. Which companies ask this question?

Almost every product-based company and many service-based companies.
