# 🗳️ Voter Registration System (Java + DSA)

This is a command-line voter registration system built using Java's `HashSet`. It allows users to register voter IDs, check for duplicates, view all registered IDs, and exit the system. Duplicate registrations are prevented automatically thanks to the properties of a Set.

---

## 📋 Features

- 🆔 Register new voter IDs
- 🔍 Check if a voter ID is already registered
- 📋 View all registered voter IDs
- ❌ Prevent duplicate registrations
- 🚪 Exit the system

---

## 🧠 DSA Concepts Used

- ✅ Java `HashSet` (no duplicates)
- ✅ Set operations: `add()`, `contains()`, `iteration`
- ✅ Input handling with `Scanner`
- ✅ `switch-case` and `while` loop control flow

---

## ▶️ How to Run

1. **Compile the program:**
```bash
javac VoterRegistrationSystem.java
```

2. **Run:**
```bash
java VoterRegistrationSystem
```

3. **Sample Flow:**
```bash
Choose an option:
1. Register new Voter ID
2. Check if Voter ID is registered
3. View all registered Voter IDs
4. Exit
➡️ Your choice: 1

🆔 Enter Voter ID to register: VTR12345
✅ Voter ID registered successfully!
```

🛡️ **Notes**<br>
--> HashSet ensures no voter can be registered twice<br>
--> Entries are case-sensitive (VTR123 ≠ vtr123)<br>
--> Can be extended with file-based storage, timestamps, or authentication

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
