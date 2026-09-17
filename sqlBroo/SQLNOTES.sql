/*
Comparison Operators

These are extremely important:
Operator	Meaning
=	equal
>	greater than
<	less than
>=	greater than or equal
<=	less than or equal
<>	not equal
*/

/*Import notes:
name VARCHAR(50)                                
name → column name
VARCHAR(50) → text up to 50 characters
What does * mean?
It means:
Give me all columns.
*/
/*
Suppose the question is:
Find employees who work in IT AND have salary greater than 50,000.
We use:
SELECT *
FROM employees
WHERE department = 'IT'
AND salary > 50000;

AND
Both conditions must be true.
IT       ✅
salary   > 50000 ✅
------------------
Result   ✅

OR
At least one condition must be true.
SELECT *
FROM employees
WHERE department = 'IT'
OR salary > 70000;

NOT
Negates a condition.
SELECT *
FROM employees
WHERE NOT department = 'IT';
*/