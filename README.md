# Employee Management System

A **console-based Employee Management System** built using **Core Java, JDBC, and MySQL**. This application performs complete **CRUD (Create, Read, Update, Delete)** operations on employee records stored in a MySQL database. The project follows the **DAO (Data Access Object) Design Pattern**, ensuring a clean separation between business logic and database operations.

This project demonstrates practical implementation of **Java Database Connectivity (JDBC)**, object-oriented programming principles, exception handling, and database integration.

---

## 🚀 Features

- ➕ Add a New Employee
- 🔍 Search Employee by Employee ID
- 📋 View All Employee Records
- ✏️ Update Employee Information
- 🗑️ Delete Employee Records
- 🔗 JDBC-based MySQL Database Connectivity
- 📂 DAO Design Pattern Implementation
- 📦 POJO (Plain Old Java Object) Model
- ⚠️ SQL Exception Handling
- 📊 Formatted Console Output

---

## 🛠️ Tech Stack

| Technology | Description |
|------------|-------------|
| Java | Core Java |
| JDBC | Database Connectivity |
| MySQL | Relational Database |
| IntelliJ IDEA | IDE |
| Git | Version Control |
| GitHub | Code Hosting |

---

## 📁 Project Structure

```
Employee-Management-System-Java
│
├── src
│   └── com
│       └── ansh
│           └── empmgmt
│               ├── app
│               │   └── EmpMgmtApp.java
│               │
│               ├── dao
│               │   └── EmpDAO.java
│               │
│               ├── dbutil
│               │   └── DBConnection.java
│               │
│               └── pojo
│                   └── EmpPojo.java
│
└── README.md
```

---

## 💾 Database Configuration

### Database Name

```
employee
```

### Table Name

```
emp
```

### SQL Script

```sql
CREATE DATABASE employee;

USE employee;

CREATE TABLE emp (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    sal DOUBLE,
    deptno INT
);
```

---

## 🔌 Database Connection

Update your MySQL credentials in **DBConnection.java**

```java
DriverManager.getConnection(
    "jdbc:mysql://127.0.0.1:3306/employee",
    "YOUR_USERNAME",
    "YOUR_PASSWORD"
);
```

---

## ▶️ How to Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/anshgupta43/Employee-Management-System-Java.git
```

### 2️⃣ Open the Project

Open the project using:

- Eclipse IDE

---

### 3️⃣ Configure MySQL

Create the database and table using the SQL script provided above.

---

### 4️⃣ Update Database Credentials

Modify the username and password inside:

```
DBConnection.java
```

---

### 5️⃣ Add MySQL JDBC Driver

Download MySQL Connector/J and add it to your project's classpath.

---

### 6️⃣ Run the Application

Execute:

```
EmpMgmtApp.java
```

---

## 📸 Sample Output

```
===================== EMPLOYEE RECORDS =====================

Emp ID     Employee Name        Salary          Dept No
------------------------------------------------------------
101        Abhishek             50000.00        10
102        Rohan                65000.00        30
103        Aditya               70000.00        20
104        Kunal                40000.00        20
------------------------------------------------------------
Total Employees : 4
```

---
## 📚 Concepts Used

- Core Java
- Object-Oriented Programming (OOP)
- JDBC API
- DAO Design Pattern
- POJO Classes
- Collections Framework
- MySQL
- Exception Handling
- SQL
- CRUD Operations
- 
---

## 🎯 Learning Outcomes

Through this project I learned:

- Connecting Java applications with MySQL using JDBC
- Writing SQL CRUD queries
- Implementing DAO Architecture
- Organizing Java projects using packages
- Handling SQL Exceptions
- Working with Java Collections
- Building a complete console-based application
- Using Git and GitHub for version control
---
## 🔮 Future Enhancements

- 🔐 Login & Authentication
- 🔎 Search by Employee Name
- 📂 Department-wise Filtering
- 📈 Salary Sorting
- ✅ Input Validation
- 📄 Export Records to PDF/Excel
- 🌐 Spring Boot REST API Version
- 🖥️ JavaFX/Swing GUI
- 📊 Dashboard & Analytics

---
## 👨‍💻 Author
**Ansh Gupta**
Java Full Stack Developer
GitHub:
https://github.com/anshgupta43
### Made with ❤️ By Ansh Gupta
