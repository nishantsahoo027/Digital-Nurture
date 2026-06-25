/*
==========================================
PL/SQL Assignment
Database Setup
==========================================

Description:
Creates all required tables and inserts
sample data used throughout the exercises.

Author: Nishant Sahoo
==========================================
*/

--------------------------------------------------
-- Drop Existing Tables (Optional)
--------------------------------------------------
-- DROP TABLE Loans CASCADE CONSTRAINTS;
-- DROP TABLE Accounts CASCADE CONSTRAINTS;
-- DROP TABLE Employees CASCADE CONSTRAINTS;
-- DROP TABLE Customers CASCADE CONSTRAINTS;

--------------------------------------------------
-- Create Customers Table
--------------------------------------------------

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

--------------------------------------------------
-- Create Loans Table
--------------------------------------------------

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

--------------------------------------------------
-- Create Accounts Table
--------------------------------------------------

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

--------------------------------------------------
-- Create Employees Table
--------------------------------------------------

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

--------------------------------------------------
-- Insert Customer Records
--------------------------------------------------

INSERT INTO Customers VALUES (1,'John',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Alice',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'David',70,20000,'FALSE');
INSERT INTO Customers VALUES (4,'Emma',30,5000,'FALSE');

--------------------------------------------------
-- Insert Loan Records
--------------------------------------------------

INSERT INTO Loans VALUES (101,1,8,SYSDATE+10);
INSERT INTO Loans VALUES (102,2,10,SYSDATE+60);
INSERT INTO Loans VALUES (103,3,9,SYSDATE+20);
INSERT INTO Loans VALUES (104,4,11,SYSDATE+90);

--------------------------------------------------
-- Insert Account Records
--------------------------------------------------

INSERT INTO Accounts VALUES (1001,1,'Savings',10000);
INSERT INTO Accounts VALUES (1002,2,'Savings',8000);
INSERT INTO Accounts VALUES (1003,3,'Current',15000);
INSERT INTO Accounts VALUES (1004,4,'Savings',5000);

--------------------------------------------------
-- Insert Employee Records
--------------------------------------------------

INSERT INTO Employees VALUES (1,'Rahul','IT',50000);
INSERT INTO Employees VALUES (2,'Priya','HR',45000);
INSERT INTO Employees VALUES (3,'Amit','IT',60000);
INSERT INTO Employees VALUES (4,'Neha','Finance',55000);

COMMIT;

--------------------------------------------------
-- Verification Queries
--------------------------------------------------

SELECT * FROM Customers;
SELECT * FROM Loans;
SELECT * FROM Accounts;
SELECT * FROM Employees;