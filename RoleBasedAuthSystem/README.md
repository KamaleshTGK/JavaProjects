# 🔐 Role-Based Auth System (Java Interface + Abstract Class)

This project demonstrates a simple **role-based authentication system** in Java using both **interfaces** and **abstract classes**. It includes two user types — `Admin` and `Guest` — each implementing their own login behavior and role information, while sharing a common abstract base.

---

## 📋 Features

- ✅ Login and logout methods using `Auth` interface  
- 👥 Shared user structure via an abstract `User` class  
- 🔐 Role-based access (`Admin` with full access, `Guest` with limited access)  
- 🧠 Demonstrates OOP principles like inheritance, abstraction, and polymorphism  

---

## 🧠 Java Concepts Used

- `interface` for defining login/logout contract (`Auth`)
- `abstract class` for shared user behavior (`User`)
- Method overriding
- Polymorphism and encapsulation

---

## ▶️ How to Run

1. **Compile:**
```bash
javac MainAuth.java
```

2. **Run:**
```bash
java MainAuth
```

3. **Sample Output:**
```bash
Admin Alice logged in.
User: Alice
Admin role: Full access to system.
Admin logged out.

Guest Kamal logged in.
User: Kamal
Guest role: Limited access to the system.
Guest logged out.
```
## 📁 **Note**
All supporting classes (Admin, Guest, User, Auth) are inside the same file.
They will be compiled automatically — no need to save them separately.

👨‍💻 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
