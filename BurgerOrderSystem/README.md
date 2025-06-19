## 🍔 Burger Order System (Java + DSA)

This is a fun and practical implementation of a **priority queue** using Java’s `PriorityQueue` class. It simulates a burger ordering system where customers are served based on their priority — e.g., VIPs are served first, followed by normal, then bulk orders.

---

## 📋 Features

- 🙋‍♂️ Take multiple burger orders with names and priorities
- 🏆 Serve orders in priority order (1 = VIP, 2 = Normal, 3 = Bulk)
- ✅ Demonstrates real-world use of Priority Queues
- 🧠 Implements `Comparable<BurgerOrder>` for custom sorting

---

## 🧠 DSA Concepts Used

- ✅ Priority Queue (Min-Heap) via `PriorityQueue`
- ✅ Custom object comparison with `compareTo`
- ✅ Sorting by numeric priority (lower = higher priority)
- ✅ Real-time queue processing

---

## ▶️ How to Run

1. **Compile:**
```bash
javac BurgerOrderSystem.java
```

2. **Run:**
```bash
java BurgerOrderSystem
```

3. **Sample Input:**
```bash
🍔 How many customers are ordering today? 3

👤 Customer 1
Enter customer name: Alice
Enter priority (1 = VIP, 2 = Normal, 3 = Bulk Order): 2

👤 Customer 2
Enter customer name: Bob
Enter priority: 1

👤 Customer 3
Enter customer name: Charlie
Enter priority: 3
```

4. **Output:**
```bash
🍔 Serving Orders based on Priority:

➡️ Serving: Bob (Priority 1)
➡️ Serving: Alice (Priority 2)
➡️ Serving: Charlie (Priority 3)
```

📌 **Notes**
- Lower numeric values mean higher priority
- Internally uses a min-heap structure (PriorityQueue)
- Could be extended with a GUI or real-time restaurant kiosk logic

👨‍💻 **Author:**
**Kamalesh TGK**<br>
Learning DSA the tasty way 😋






