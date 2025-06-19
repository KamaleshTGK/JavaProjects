# 🚨 Emergency Room System (Java + DSA)

This project simulates an emergency room triage system using Java's `PriorityQueue`. Patients are registered with a **severity level**, and the system treats them based on their priority — with more severe cases handled first.

---

## 📋 Features

- 🧍 Register multiple patients with name and severity
- ⚠️ Automatically treats patients in order of severity (lowest number = highest priority)
- 💉 Realistic hospital emergency queue simulation
- 🔁 Uses `Comparable` for custom patient prioritization

---

## 🧠 DSA Concepts Used

- ✅ `PriorityQueue` (min-heap based priority queue)
- ✅ Custom class implementing `Comparable<Patient>`
- ✅ Queue processing with priority logic
- ✅ Input handling with `Scanner`

---

## ▶️ How to Run

1. **Compile:**
```bash
javac EmergencyRoomSystem.java
```
2. **Run:**
```bash
java EmergencyRoomSystem
```

3.**Example Input:**
```bash
How many patients to register? 3

Enter patient 1 name: John
Enter severity level (1=serious, higher=less serious): 2

Enter patient 2 name: Alice
Enter severity: 1

Enter patient 3 name: Mark
Enter severity: 4
```



