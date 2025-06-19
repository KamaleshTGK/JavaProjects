# 🔐 Secure Password Manager (Java + Encapsulation)

This simple project demonstrates the principle of **Encapsulation** in Java. A `PasswordManager` class is used to securely store and retrieve passwords with basic encryption (string reversal), and access is only granted via a correct security answer.

---

## 📋 Features

- 🔒 Passwords are stored in an encrypted form
- 🔁 Simple reversible encryption using `StringBuilder.reverse()`
- ✅ Password retrieval only with correct security answer
- 🧼 Clean encapsulated design

---

## 🧠 Concepts Used

- ✅ Encapsulation (`private` variables and methods)
- ✅ Class separation of concerns (`PasswordManager`)
- ✅ Method access control (`setPassword`, `getPassword`)
- ✅ Simple input/output with `Scanner`

---

## ▶️ How to Run

1. **Compile the program:**
```bash
javac SecurePasswordManager.java
```

2. **Run the program:**
```bash
java SecurePasswordManager
```

3. **Sample output:**
```bash
Enter password to store: MySecret123
Password stored securely.
Enter security answer to retrieve the password: 12345
Decrypted Password: MySecret123
```

## ⚙️ Note
- The helper class PasswordManager is defined in the same file as the main class 
SecurePasswordManager.
- You do **not need to save it separately** — it will be compiled automatically when you run:

```bash
javac SecurePasswordManager.java
```
📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
