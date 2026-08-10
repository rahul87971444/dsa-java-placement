# First Non-Repeated Character — Interview Questions

## Q1. Why do we need two passes?

The first pass determines frequency.

The second pass preserves the original order and finds the first character whose frequency is 1.

Example:

```text
aabbcd
```

Frequency tells us:

```text
c → 1
d → 1
```

But we still need to know which appeared first.

The original String gives us that order.

---

## Q2. Why can't we just find all characters with frequency 1?

Because the question asks for the FIRST non-repeated character.

Example:

```text
aabbcde
```

Both:

```text
c
d
e
```

occur once.

But the answer is:

```text
c
```

---

## Q3. Why use HashMap?

We need:

```text
Character → Frequency
```

For example:

```text
s → 3
w → 1
i → 1
```

HashMap naturally represents this relationship.

---

## Q4. What does getOrDefault() do?

```java
map.getOrDefault(key, defaultValue)
```

returns the value for the key if it exists.

Otherwise it returns the default value.

Example:

```java
map.getOrDefault('x', 0)
```

If `x` isn't present:

```text
0
```

---

## Q5. Why use HashMap instead of HashSet?

HashSet answers:

```text
Does this character exist?
```

HashMap answers:

```text
How many times does this character occur?
```

We need frequency, so HashMap is appropriate.

---

## Q6. Can we use an int[26]?

Yes, if the input is guaranteed to contain only lowercase English letters.

Then:

```java
int[26]
```

can store frequencies.

---

## Q7. What if the String contains uppercase and lowercase characters?

Then:

```text
'A'
```

and:

```text
'a'
```

can be treated as different characters unless we explicitly convert the input to one case.

---

## Q8. What if there is no non-repeated character?

Example:

```text
aabbcc
```

There is no character whose frequency is 1.

We should return an appropriate result such as:

```text
No non-repeated character
```

or, in a coding-platform problem, whatever return value the problem specifies.

---

## Q9. Why is the optimized solution O(n)?

First traversal:

```text
O(n)
```

Second traversal:

```text
O(n)
```

Therefore:

```text
O(n) + O(n)
= O(n)
```

---

## Q10. What is the difference between this and "remove duplicates"?

Remove duplicates:

```text
banana → ban
```

First non-repeated:

```text
swiss → w
```

They solve completely different problems.

---

## Q11. Interviewer: Can you do it using LinkedHashMap?

Yes.

A LinkedHashMap maintains insertion order.

However, you still need to distinguish between "first inserted" and "first character with frequency 1"; the simplest robust solution is still count first and then scan the original String.

---

## Q12. Interviewer: What is the difference between HashMap and LinkedHashMap?

HashMap:

```text
No guaranteed iteration order
```

LinkedHashMap:

```text
Maintains insertion order
```

---

## Q13. Interviewer: What is the difference between HashMap and TreeMap?

HashMap:

```text
No sorted-order guarantee
```

LinkedHashMap:

```text
Insertion order
```

TreeMap:

```text
Sorted by key
```

This is an important Java Collections interview distinction.

---

## Q14. One-Line Revision

```text
Frequency Map
      ↓
Scan Original String
      ↓
First Frequency = 1
```
