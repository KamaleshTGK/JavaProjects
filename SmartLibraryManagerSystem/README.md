# 📘 Smart Library Manager System (Java + OOP + DSA)

A simple yet powerful command-line Library Manager built using Java. It uses OOP concepts and Java Collections to manage books with unique IDs. Users can add, borrow, return, and view available books.

---

## 📋 Features

- ➕ Add new books with title, author, genre, and ID
- 📖 Borrow books (marked unavailable)
- 🔁 Return borrowed books
- 📚 View all **available** books
- ❌ Prevent borrowing non-existent or already borrowed books
- ✅ Uses `TreeMap` to keep books sorted by ID

---

## 🧠 Concepts & DSA Used

- ✅ Java Classes & OOP (Encapsulation, Object Design)
- ✅ `TreeMap` for sorted book storage
- ✅ `Scanner` for user input
- ✅ `Map`, `EntrySet`, and conditional filtering
- ✅ Real-world logic flow using `switch`, loops, and validation

---

## 🧱 Class Overview

### 📘 `Book.java`

- Represents a single book
- Contains book attributes (ID, title, author, genre, availability)
- Has a custom `toString()` method for display

### 🧠 `LibraryManager.java`

- Main logic controller
- Uses `TreeMap<Integer, Book>` to store and sort books
- Manages menu-driven user interaction and logic

---

## ▶️ How to Run

1. **Navigate to the project folder:**
```bash
cd SmartLibraryManagerSystem
```

2. **Compile all Java files:**
```bash
javac Book.java LibraryManager.java
```
3. **Create a runner class or use the following snippet to start:** <br>
Create a file called Main.java with:<br>
```bash
public class Main {
    public static void main(String[] args) {
        new LibraryManager().startLibrary();
    }
}
```
**Then compile and run:**
```bash
javac Main.java
java Main
```

💡 **Sample Flow**
```bash
Smart Library Menu:
1. Add Book
2. Remove Book
3. Return Book
4. Show Available Books
5. Exit
👉 Choose an option: 1

📚 Enter Book ID: 101
📝 Title: Clean Code
👤 Author: Robert C. Martin
🏷️ Genre: Programming
✅ Book added successfully!
```

📁 Folder Structure
```bash
SmartLibraryManagerSystem/
├── Book.java
├── LibraryManager.java
├── Main.java
``` 

🚀 **Extensions (Ideas)** <br>
File/database persistence<br>
Overdue tracking with timestamps<br>
Advanced search filters (genre/author/title)<br>
User authentication and roles

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐


