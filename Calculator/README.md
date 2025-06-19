# 🧮 Calculator with Exception Handling (Java)

This is a simple calculator application built in Java that handles user input robustly using **custom exceptions**, **arithmetic exception handling**, and `try-catch-finally` blocks.

---

## 📋 Features

- ➕ Basic calculator operations: `+`, `-`, `*`, `/`
- ❌ Disallows negative number input (throws custom `InvalidInputException`)
- ⚠️ Prevents division by zero
- 🛑 Detects invalid operators
- ✅ Graceful error reporting with meaningful messages

---

## 🧠 Concepts Used

- ✅ `try-catch-finally` block
- ✅ Custom exception class (`InvalidInputException`)
- ✅ Multiple `catch` blocks for specific error types
- ✅ Java user input with `Scanner`

---

## ▶️ How to Run

1. **Save the code** in a file named:
```bash
Calculator.java
```

2. **Compile the program:**
```bash
javac Calculator.java
```

3. **Run the program:**
```bash
java Calculator
```

4. **Sample Output:**
```bash
Enter the first number: 10
Enter the second number: -5
Custom Error: Negative numbers are not allowed.
Calculator finished.
```
## ⚙️ **Note**
- The helper class InvalidInputException is defined inside the same file (Calculator.java)
- You do not need to save it separately — it gets compiled automatically along with the main
  class.

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
