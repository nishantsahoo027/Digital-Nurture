/*
==========================================
PL/SQL Assignment
Exercise 3 : Stored Procedures
==========================================
*/
--------------------------------------------------
-- Scenario 1
-- Process Monthly Interest
--------------------------------------------------
-- Objective:
-- Apply 1% monthly interest to all
-- Savings accounts.
--------------------------------------------------

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;
END;
/
--------------------------------------------------
-- Execute Procedure
--------------------------------------------------

BEGIN
    ProcessMonthlyInterest;
END;
/
--------------------------------------------------
-- Verification
--------------------------------------------------

SELECT * FROM Accounts;
--------------------------------------------------
-- Output Obtained
--------------------------------------------------

-- PL/SQL procedure successfully completed.

-- Updated Account Balances:
-- AccountID 1001 : 10000 -> 10100
-- AccountID 1002 : 8000  -> 8080
-- AccountID 1003 : 15000 -> 15000
-- AccountID 1004 : 5000  -> 5050

--------------------------------------------------
-- Conclusion
--------------------------------------------------

-- Interest was successfully applied to all
-- Savings accounts while Current accounts
-- remained unchanged.


--------------------------------------------------
-- Scenario 2
-- Update Employee Bonus
--------------------------------------------------
-- Objective:
-- Update the salary of employees in a given
-- department by adding a bonus percentage
-- passed as a parameter.
--------------------------------------------------

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus / 100)
    WHERE Department = p_department;

    COMMIT;
END;
/

--------------------------------------------------
-- Execute Procedure
--------------------------------------------------

BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/

--------------------------------------------------
-- Verification
--------------------------------------------------

SELECT * FROM Employees;

--------------------------------------------------
-- Output Obtained
--------------------------------------------------

-- PL/SQL procedure successfully completed.

-- Updated Employee Salaries:
-- Rahul (IT)     : 50000 -> 55000
-- Priya (HR)     : 45000 -> 45000
-- Amit (IT)      : 60000 -> 66000
-- Neha (Finance) : 55000 -> 55000

--------------------------------------------------
-- Conclusion
--------------------------------------------------

-- Employees in the IT department received
-- a 10% salary bonus. Salaries of employees
-- in other departments remained unchanged.


--------------------------------------------------
-- Scenario 3
-- Transfer Funds
--------------------------------------------------
-- Objective:
-- Transfer a specified amount from one
-- account to another after verifying
-- that the source account has sufficient
-- balance.
--------------------------------------------------

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_fromAccount IN NUMBER,
    p_toAccount IN NUMBER,
    p_amount IN NUMBER
)
AS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_fromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_toAccount;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful');

        COMMIT;

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;
END;
/

--------------------------------------------------
-- Execute Procedure
--------------------------------------------------

BEGIN
    TransferFunds(1001,1002,2000);
END;
/

--------------------------------------------------
-- Verification
--------------------------------------------------

SELECT * FROM Accounts;

--------------------------------------------------
-- Output Obtained
--------------------------------------------------

-- Transfer Successful
-- PL/SQL procedure successfully completed.

-- Updated Account Balances:
-- AccountID 1001 : 10100 -> 8100
-- AccountID 1002 : 8080  -> 10080
-- AccountID 1003 : 15000 -> 15000
-- AccountID 1004 : 5050  -> 5050

--------------------------------------------------
-- Conclusion
--------------------------------------------------

-- Funds were successfully transferred
-- from Account 1001 to Account 1002
-- after verifying that the source
-- account had sufficient balance.