/*
==========================================
Exercise 1
Control Structures
==========================================
*/

--------------------------------------------------
-- Scenario 1
-- Apply 1% discount to customers
-- above 60 years of age
--------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT c.CustomerID,l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID=l.CustomerID
        WHERE c.Age>60
    )
    LOOP
        UPDATE Loans
        SET InterestRate=InterestRate-1
        WHERE LoanID=rec.LoanID;
        DBMS_OUTPUT.PUT_LINE(
        'Discount applied to Loan ID: '||rec.LoanID);

    END LOOP;
    COMMIT;
END;
/

--------------------------------------------------
-- Verification
--------------------------------------------------

SELECT * FROM Loans;

--------------------------------------------------
-- Expected Output
--------------------------------------------------

-- Discount applied to Loan ID:101
-- Discount applied to Loan ID:103

--------------------------------------------------
-- Scenario 2
-- Promote customers to VIP
--------------------------------------------------

BEGIN
    FOR rec IN(
        SELECT CustomerID,Name
        FROM Customers
        WHERE Balance>10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP='TRUE'
        WHERE CustomerID=rec.CustomerID;
        DBMS_OUTPUT.PUT_LINE(
        rec.Name||' promoted to VIP');
    END LOOP;
    COMMIT;
END;
/

--------------------------------------------------
-- Verification
--------------------------------------------------

SELECT * FROM Customers;

--------------------------------------------------
-- Expected Output
--------------------------------------------------

-- John promoted to VIP
-- David promoted to VIP

--------------------------------------------------
-- Scenario 3
-- Loan Reminder
--------------------------------------------------

BEGIN
FOR rec IN(
SELECT c.Name,l.LoanID,l.DueDate
FROM Customers c
JOIN Loans l
ON c.CustomerID=l.CustomerID
WHERE l.DueDate
BETWEEN SYSDATE
AND SYSDATE+30
)

LOOP
DBMS_OUTPUT.PUT_LINE(
'Reminder: Dear '
||rec.Name||
', your Loan ID '
||rec.LoanID||
' is due on '
||TO_CHAR(rec.DueDate,
'DD-MON-YYYY')
);

END LOOP;
END;
/

--------------------------------------------------
-- Expected Output
--------------------------------------------------

-- Reminder: Dear John, your Loan ID 101...
-- Reminder: Dear David, your Loan ID 103...