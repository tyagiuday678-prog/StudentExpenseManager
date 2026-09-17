# Student Expense & Budget Manager

## 1. Problem Statement

Students often have multiple daily expenses such as food, transportation, study materials, and entertainment. Without proper tracking, it can become difficult to understand where money is being spent and whether monthly spending is within a planned budget.

The **Student Expense & Budget Manager** is a Java-based command-line application designed to help students record and manage their expenses and monitor their monthly budget.

## 2. Objectives

The main objectives of the project are:

* To provide a simple system for recording student expenses.
* To allow users to view their recorded expenses.
* To allow users to update and delete expenses.
* To allow users to define a monthly budget.
* To calculate total expenses and remaining budget.
* To indicate when the user exceeds the monthly budget.
* To store expense information permanently using file handling.
* To demonstrate practical Java programming concepts.

## 3. Scope

The project focuses on basic personal expense and budget management through a command-line interface.

The application provides:

1. Expense management
2. Budget management
3. Expense calculation and monitoring
4. File-based data persistence

The current version is intended for a single user and stores data locally.

## 4. Functional Requirements

### FR1 — Add Expense

The system shall allow the user to enter:

* Expense ID
* Amount
* Category
* Description
* Date

### FR2 — View Expenses

The system shall display all expenses currently stored in the application.

### FR3 — Update Expense

The system shall allow an existing expense to be modified using its ID.

### FR4 — Delete Expense

The system shall allow an existing expense to be deleted using its ID.

### FR5 — Set Monthly Budget

The system shall allow the user to define a monthly budget.

### FR6 — View Budget Status

The system shall calculate and display:

* Monthly budget
* Total expenses
* Remaining budget
* Whether the budget has been exceeded

### FR7 — Data Persistence

The system shall save expense information to a local text file and load previously saved expenses when the application starts.

## 5. Non-Functional Requirements

### Usability

The application should provide a simple menu-driven command-line interface.

### Reliability

The system should correctly store and retrieve expense information.

### Maintainability

The project is divided into models, services, and utility components to make the source code easier to maintain.

### Portability

The application should run on systems with a compatible Java Development Kit installed.

### Performance

The application is designed for normal student-scale expense records and should provide quick operations for adding, viewing, updating, and deleting expenses.

## 6. Major Modules

### Module 1 — Expense Management

Responsible for:

* Adding expenses
* Viewing expenses
* Updating expenses
* Deleting expenses

Main classes:

* `Expense`
* `ExpenseService`

### Module 2 — Budget Management

Responsible for:

* Setting the monthly budget
* Calculating remaining budget
* Checking whether the budget has been exceeded

Main class:

* `Budget`

### Module 3 — File Management

Responsible for:

* Saving expenses to a file
* Loading expenses from a file

Main class:

* `FileManager`

## 7. Project Architecture

The application follows a simple layered structure:

```text
User
  |
  v
Main.java
  |
  v
ExpenseService
  |
  v
Expense Model
  |
  v
FileManager
  |
  v
data/expenses.txt
```

The `Budget` model is used by `Main.java` to perform monthly budget calculations.

## 8. Technologies Used

* Java 25
* Java OOP
* Java Collections
* ArrayList
* File I/O
* LocalDate
* Command-line interface
* Git and GitHub

## 9. Expected Outcome

The completed application provides students with a simple command-line tool for recording expenses, managing a monthly budget, monitoring spending, and maintaining expense data between application runs.

## 10. Future Enhancements

Possible future improvements include:

* Category-wise expense reports
* Monthly expense summaries
* Search and filtering
* Graphical user interface
* Database storage
* User authentication
* Exporting reports
