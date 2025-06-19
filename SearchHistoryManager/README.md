# 🔍 Search History Manager (Java + DSA)

This is a simple Java console app that mimics a search history system. It stores user-entered search terms using a `LinkedHashSet`, ensuring that duplicate entries are automatically removed while preserving the original order of searches.

---

## 📋 Features

- ⌨️ Accepts unlimited search input
- ❌ Ignores duplicate searches
- 🧠 Maintains the order of first appearance
- 🛑 Type `exit` to stop and view search history

---

## 🧠 DSA Concepts Used

- ✅ `LinkedHashSet` from Java Collections
- ✅ Set properties: no duplicates, insertion order
- ✅ Input loop using `Scanner`
- ✅ Real-world simulation of browser search history

---

## ▶️ How to Run

1. **Compile the program:**
```bash
javac SearchHistoryManager.java
```

2. **Run:**
```bash
java SearchHistoryManager
```

3. **Sample Input:**
```bash
🔍 Search: java collections
🔍 Search: data structures
🔍 Search: java collections
🔍 Search: cybersecurity basics
🔍 Search: exit
```

4. **Output:**
```bash
🗂️ Your Search History:
-  java collections
-  data structures
-  cybersecurity basics
```

🧪 **Notes**<br>
--> LinkedHashSet automatically filters out repeated searches<br>
--> Case-sensitive input (e.g., Java ≠ java)<br>
--> Can be extended to support search timestamps or recent limits

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
