# 🏦 Bank Management System (Java OOP Project)

A **console-based Bank Management System** built using core Java with strong implementation of **Object-Oriented Programming (OOP)** and clean architecture principles.

This project simulates real-world banking operations such as account creation, deposits, withdrawals, fund transfers, and transaction tracking — all without using any database (in-memory system using collections).

---

## 🚀 Features

* 🏦 Create Normal & Savings Accounts
* 💰 Deposit & Withdraw Money
* 🔄 Transfer Funds Between Accounts
* 📊 Check Account Balance
* 📜 Transaction History with Timestamps
* 💡 Interest Calculation (Savings Account)
* ⚠️ Minimum Balance Rule for Savings Account
* 🔁 Menu-driven CLI Interface
* 🛡️ Exception Handling for Safe Input
* 🔢 Auto-generated Unique Account Numbers

---

## 🧠 Concepts Used

### 🔹 Core Java

* Classes & Objects
* Methods & Constructors
* Access Modifiers

### 🔹 OOP Principles

* **Encapsulation** → Secure data using private variables
* **Inheritance** → `SavingsAccount extends Account`
* **Polymorphism** → Dynamic method behavior
* **Abstraction** → Service layer manages logic

### 🔹 System Design

* Service Layer (`BankService`)
* Separation of Concerns
* Modular Structure

### 🔹 Data Structures

* `HashMap` → Store accounts
* `ArrayList` → Store transaction history

### 🔹 Exception Handling

* Safe and reusable input methods

---

## 🏗️ Project Structure

```
BankManagementSystem/
│
├── Account.java
├── SavingsAccount.java
├── BankService.java
├── Main.java
```

---

## 🔄 System Flow

```
User (CLI)
   ↓
Main (Menu)
   ↓
BankService (Business Logic)
   ↓
Account / SavingsAccount (Model)
```

---

## ⚙️ How to Run

1. Clone the repository
2. Open in any Java IDE (IntelliJ / Eclipse / VS Code)
3. Compile and run `Main.java`
4. Use the menu to perform operations

---

## 📸 Sample Operations

```
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Funds
5. Check Balance
6. Transaction History
7. Add Interest
8. Exit
```

---

## 🔥 Key Highlights

* Built a **mini banking backend system** using pure Java
* Implemented **real-world business rules** (minimum balance, transfers)
* Designed a **transaction logging system with timestamps**
* Followed **clean architecture and modular design**
* Developed a **scalable base for future upgrades (JDBC / APIs)**

---

## 🚀 Future Enhancements

* 🔌 Add JDBC integration with MySQL
* 🌐 Convert into REST API using Spring Boot
* 🔐 Add authentication system (login/signup)
* 🖥️ Build frontend (React or similar)
* ☁️ Deploy on cloud platforms

---

## 🧑‍💻 Author

**Shubham Kumar**

---
