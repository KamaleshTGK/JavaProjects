# 📝 Notepad with Undo Feature (Java + DSA)

This is a simple notepad simulator that allows users to add text and undo changes using Java's `Stack`. It demonstrates how the **Last-In-First-Out (LIFO)** principle works in real-world applications like text editors.

---

## 📋 Features

- ➕ Add new text content
- ↩️ Undo the last change
- ❌ Prevents undo if no history exists
- 👋 Exit the program safely
- 📌 Stack-based version history tracking

---

## 🧠 DSA Concepts Used

- ✅ `Stack<String>` for maintaining text history
- ✅ Push/pop operations
- ✅ User input with `Scanner`
- ✅ Loop and control flow with `switch-case`

---

## ▶️ How to Run

1. **Compile the program:**
```bash
javac NotePadUndo.java
```

2. **Run the program:**
```bash
java NotePadUndo
```

3. **Sample Input:**
```bash
Current Text: 
Choose an option:
1. Add text
2. Undo Last
3. Exit
📝 Enter text to add: Hello, world!
```
If you undo:

```bash
↩️ Undo Successful!
Current Text:
```

💡 **How It Works**
- Each time you add text, the current version is pushed to the stack
- When you select Undo, the last version is popped from the stack and restored
- If the stack is empty, it prevents undo

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
