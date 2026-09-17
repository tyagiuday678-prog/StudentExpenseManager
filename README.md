# Student Expense & Budget Manager

A Java-based console application designed to help students manage their daily expenses and monthly budgets.

## 📌 Project Overview

The **Student Expense & Budget Manager** allows users to record, manage, and monitor their expenses. The application provides basic expense management features along with monthly budget tracking.

The project is developed using **Java** and demonstrates concepts such as Object-Oriented Programming, Collections, File I/O, and modular project structure.

## 🚀 Features

* Add a new expense
* View all expenses
* Update an existing expense
* Delete an expense
* Set a monthly budget
* View total expenses
* View remaining budget
* Check whether the budget has been exceeded
* Save expenses to a file
* Load previously saved expenses when the application starts

## 🛠️ Technologies Used

* **Java 25**
* Object-Oriented Programming (OOP)
* Java Collections (`ArrayList`)
* File Handling / File I/O
* `LocalDate`
* Java Exception Handling concepts
* Command Line Interface (CLI)

## 📂 Project Structure

```text
StudentExpenseManager/
│
├── Main.java
│
├── data/
│   └── expenses.txt
│
├── src/
│   ├── model/
│   │   ├── Expense.java
│   │   └── Budget.java
│   │
│   ├── service/
│   │   └── ExpenseService.java
│   │
│   └── util/
│       └── FileManager.java
│
├── test/
│
├── .gitignore
└── README.md
```

## ⚙️ How to Run

### 1. Compile the project

Open the terminal in the project directory and run:

```bash
javac -d out src/model/Expense.java src/model/Budget.java src/service/ExpenseService.java src/util/FileManager.java Main.java
```

### 2. Run the application

```bash
java -cp out Main
```

## 📋 Main Menu

```text
==========================================
     STUDENT EXPENSE & BUDGET MANAGER
==========================================

1. Add Expense
2. View Expenses
3. Update Expense
4. Delete Expense
5. Set Monthly Budget
6. View Budget Status
7. Exit
```

## 💾 Data Storage

Expense information is stored locally in:

```text
data/expenses.txt
```

The application loads previously saved expenses when it starts and saves the expenses before exiting.

## 🎯 Learning Objectives

This project demonstrates practical implementation of:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* ArrayList
* Loops and Conditional Statements
* File Input/Output
* Packages
* Modular Java project organization
* Basic budget calculations

## 👨‍💻 Author

**Uday Tyagi**

## 📄 License

This project is created for educational and academic purposes.
