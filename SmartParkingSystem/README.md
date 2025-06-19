# 🅿️ Smart Parking System (Java + OOP + Firewall Check)

This is a command-line Java project simulating a smart parking management system. It calculates parking fees based on the vehicle type and duration and includes a built-in firewall that blocks blacklisted vehicles.

---

## 📁 Project Structure

All classes (`ParkingVehicle`, `ParkingCar`, `ParkingBike`, `ParkingTruck`, `Firewall`, and `SmartParkingSystem`) are written in a **single `.java` file**.  
> 🛠️ **Note:** Java automatically compiles inner classes (like `ParkingCar`, `ParkingBike`, etc.) without requiring separate files.

---

## 🧠 Concepts Used

- ✅ **Inheritance & Polymorphism**  
- ✅ **Method Overriding** (`calculateFee` for each vehicle type)  
- ✅ **Encapsulation**  
- ✅ **Static Firewall List for Blacklist Check**  
- ✅ **Switch Statements & User Input Handling**  

---

## 📋 Features

- 🛻 Handles **Cars**, **Bikes**, and **Trucks**
- 💵 Calculates parking fee based on:
  - Bike: ₹5/hour
  - Car: ₹20/hour
  - Truck: ₹30/hour
- 🚫 Firewall check for **blacklisted number plates**
- 🧾 Displays vehicle info and parking fee

---

## ▶️ How to Run

1. **Compile the program:**
```bash
javac SmartParkingSystem.java
```

2. **Run the program:**
```bash
java SmartParkingSystem
```

3. **Sample Flow:**
```bash
Enter vehicle type (Car/Bike/Truck): Car
Enter number plate: TN10A1234
Enter parked hours: 3

Vehicle: TN10A1234
Parking fee: ₹60
```

🚫 If the number plate is blacklisted:

```bash
Enter number plate: TN99X0001
⚠️ Access Denied! Vehicle is blacklisted.
```

📚 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
