# Employee Management System

The Employee Management System is a Java-based console application designed to manage employee information efficiently. It allows users to store, view, search, and update employee records using multiple criteria. The project is built using core Java concepts and does not require any external libraries or databases.

## Features

- View all employee records in a formatted display
- Search employees using multiple fields such as:
  - Employee ID
  - Employee Name
  - Age
  - Department
  - Designation
  - Reporting Manager ID
- Advanced search options including:
  - Exact match
  - Not equals
  - Starts with
  - Ends with
  - Contains
  - Not contains
- Update employee details after searching
- Automatic and sequential employee ID generation

## Project Structure

EmployeeManagement/
├── src/
│   ├── Employee.java
│   ├── EmployeeSystem.java
│   └── Main.java
└── EmployeeManagement.iml

## Class Description

Employee.java represents the employee data model and contains attributes such as employee ID, name, age, department, designation, and reporting manager ID.

EmployeeSystem.java contains the core business logic of the application. It manages employee records, performs searches using different comparison operators, displays employee details, and allows updating employee information.

Main.java is the entry point of the application. It initializes the system with sample employee data and demonstrates the hierarchy of employees and reporting structure.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or above
- Command Prompt / Terminal or IntelliJ IDEA

### Compilation

javac src/*.java

### Execution

java -cp src Main

## Usage

Run the application and follow the on-screen instructions to view all employees, search for specific employees using various criteria, and update employee details as required.

## Notes

- This application is developed using core Java only
- Employee data is stored in memory
- No database or external frameworks are used
- Suitable for learning object-oriented programming concepts

## License

This project is intended for educational and learning purposes only.
