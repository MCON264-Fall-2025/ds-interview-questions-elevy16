# Finding the Middle of a Linked List Using Slow/Fast Pointers
**Esther Levy – Data Structures**

---

## Explanation of the Problem

We want to find the **middle node** of a singly linked list.

### Odd number of nodes
Example:
`1 → 2 → 3 → 4 → 5` → middle is **3**

### Even number of nodes
There are two middle nodes (`m1` and `m2`).
By convention, we return **m2** (the second middle).
Example:
`1 → 2 → 3 → 4 → 5 → 6` → middle is **4**

---

## Approaches to the Problem

### Two-Pass Traversal (Less Efficient)
1. Traverse the list to count nodes (`n`).
2. Traverse again to reach the middle (`n/2`).

This requires **two full passes**, which is less efficient.

### Tortoise and Hare Algorithm (Efficient Approach)

We use two pointers moving at different speeds:

- `slow` moves 1 step at a time
- `fast` moves 2 steps at a time

When `fast` reaches the end:
- `slow` will be pointing to the **middle node**.

Behavior:
- **Odd length:** loop ends when `fast.next == null`
- **Even length:** loop ends when `fast == null` (returning the second middle)

Advantages:
- One pass
- Constant space
- Very simple to implement

---

## Complexity Analysis

### Time Complexity — O(n)
The algorithm makes a single pass through the linked list.
Both pointers (`slow` and `fast`) move forward without ever revisiting nodes.
Because the number of operations grows directly with the number of nodes `n`,
the runtime is O(n).

### Space Complexity — O(1)
The algorithm uses only two pointers (`slow` and `fast`) regardless of input size.
No additional memory, arrays, or data structures are created.
Because the amount of space used does not increase as `n` increases,
the space complexity is O(1).