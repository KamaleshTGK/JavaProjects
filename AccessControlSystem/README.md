# 🔐 Access Control System (Java, OOP)

This project simulates a role-based access control system using Object-Oriented Programming principles in Java. Users are granted different levels of access based on their roles: **User**, **Admin**, or **Guest**.

---

## 📁 Project Structure

AccessControlSystem/
├── Admin.java
├── Guest.java
├── User.java
├── SecuritySystem.java
└── Main.java



## 🧠 Concepts Demonstrated

- ✅ **Inheritance** – `Admin` and `Guest` extend from `User`
- ✅ **Polymorphism** – `accessSystem()` method behaves differently per role
- ✅ **Method Overriding** – Each role defines custom access behavior
- ✅ **Encapsulation** – User data is managed through a clean class structure

---

## 📋 Features

- 👤 `User`: Basic access  
- 🛠️ `Admin`: Full control (manage users, logs, settings)  
- 👀 `Guest`: View-only access  
- 🔐 `SecuritySystem`: Simulates login and grants access dynamically  

---

## ▶️ How to Run

1. **Compile all files:**
```bash
javac *.java
```

2. **Run the main program:**
```bash
java Main
```

3. **Sample Output:**
```bash
Logging in Alice...
Alice has basic access.
------------------------------------------------
Logging in Bob...
Bob has basic access.
Bob has ADMIN access: can manage users, logs, and settings.
------------------------------------------------
Logging in Charlie...
Charlie has GUEST access: view-only permissions.
------------------------------------------------
```

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐



