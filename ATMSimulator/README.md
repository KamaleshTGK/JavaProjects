# 🏧 ATM Simulator (Java)

This is a simple command-line ATM simulator built in Java. It allows a user to interact with a simulated ATM using a PIN-based login system, and perform common banking operations like checking balance, depositing money, withdrawing cash, and viewing transaction history.

---

## 📋 Features

- 🔐 PIN authentication (max 3 attempts)
- 💰 Check account balance
- ➕ Deposit funds
- ➖ Withdraw funds (with balance validation)
- 🧾 View transaction history
- 🚪 Exit the session

---

 ## 🧠 Concepts Used

- Java `Scanner` for user input
- `while` and `switch` for control flow
- `StringBuilder` for efficient transaction history storage
- Input validation and error handling

---

 ## ▶️ How to Run

1. **Compile** the program:
```bash
javac atmsimulator.java
```

2. **Run the program:**
```bash
java atmsimulator
```
🔑 Default PIN: 6332
💵 Starting balance: ₹1000


🧪 **Sample Flow**
```bash
Enter your 4-digit PIN: 
PIN verified. Access Granted.

--- ATM Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
5. View Transaction History
```

🛡️ **Note**
This is a beginner-level simulation intended for learning basic Java programming concepts. 
It does not represent real-world security practices and should not be used in production 
environments.

📚 **Author:**
**Kamalesh TGK** <br>
Learning Java & Cybersecurity 💻🔐

