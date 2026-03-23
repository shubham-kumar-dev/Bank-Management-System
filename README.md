📘 Bank Management System (Java OOP Project)
📌 Project Description

This is a console-based Bank Management System built using core Java concepts with a strong focus on Object-Oriented Programming (OOP) and system design principles.

The application simulates real-world banking operations such as account creation, deposits, withdrawals, fund transfers, and transaction tracking. It follows a layered architecture where business logic is separated from user interaction, making the system scalable and maintainable.

This project demonstrates how backend systems are structured before integrating databases or web frameworks.

🚀 Features
🏦 Create Normal & Savings Accounts
💰 Deposit & Withdraw Money
🔄 Transfer Funds Between Accounts
📊 Check Account Balance
📜 Transaction History with Timestamps
💡 Interest Calculation (Savings Account)
⚠️ Minimum Balance Rule for Savings Account
🔁 Menu-driven CLI Interface
🛡️ Exception Handling for Safe Input
🔢 Auto-generated Unique Account Numbers
🧠 Concepts Used
🔹 Core Java
Classes & Objects
Methods & Constructors
Access Modifiers
🔹 OOP Principles
Encapsulation → Private data with controlled access
Inheritance → SavingsAccount extends Account
Polymorphism → Same reference, different behavior
Abstraction → Service layer handles logic
🔹 System Design
Service Layer (BankService)
Separation of Concerns
Modular Code Structure
🔹 Data Structures
HashMap → Store accounts
ArrayList → Store transaction history
🔹 Exception Handling
Safe input handling using reusable methods
🏗️ Project Structure
BankManagementSystem/
│
├── Account.java
├── SavingsAccount.java
├── BankService.java
├── Main.java
🔄 System Flow
User (CLI)
   ↓
Main (Menu)
   ↓
BankService (Business Logic)
   ↓
Account / SavingsAccount (Model)
⚙️ How to Run
Clone the repository
Open in any Java IDE (IntelliJ / Eclipse / VS Code)
Compile and run Main.java
Use the menu to perform operations
📸 Sample Operations
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Funds
5. View Transactions
6. Add Interest
🔥 Key Highlights
Designed a mini banking backend system using pure Java
Implemented real-world business rules (min balance, transfers)
Built transaction logging system with timestamps
Applied clean architecture principles
Created a scalable foundation for future upgrades (JDBC / APIs)
🚀 Future Enhancements
🔌 Integrate JDBC with MySQL (persistent storage)
🌐 Convert to REST API using Spring Boot
🔐 Add authentication system (login/signup)
🖥️ Build frontend using React
☁️ Deploy on cloud platforms
🧑‍💻 Author

Shubham Kumar
