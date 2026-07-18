# 📈 Best Time to Buy and Sell Stock (LeetCode 121)

One of the most frequently asked array problems in coding interviews.

---

# 📌 Problem Statement

Given an array where each element represents the stock price on a given day, find the maximum profit you can achieve by buying once and selling once.

---

## Example

Input

```
[7,1,5,3,6,4]
```

Output

```
5
```

Explanation

Buy at

```
1
```

Sell at

```
6
```

Profit

```
5
```

---

# 🎯 Learning Objectives

- Array Traversal
- Minimum Value Tracking
- Greedy Thinking
- Maximum Profit

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Greedy | O(n) | O(1) |

---

# 🧠 Optimal Idea

Keep track of the minimum price seen so far.

For every new price,

```
Profit = Current Price - Minimum Price
```

Update the answer whenever profit becomes larger.

---

# 🌍 Real-Life Example

You want to buy a phone at the cheapest price and sell it later at the highest price.

Buying after selling is not allowed.

---

# ⏱ Complexity

Optimal

Time

```
O(n)
```

Space

```
O(1)
```

---

# ⭐ Key Takeaways

✔ Greedy Algorithm

✔ Minimum Tracking

✔ Single Pass Solution

✔ One of the Top 20 interview problems
