select department, count(*) as total_employees,
sum(salary) as total_salary,
from employees
group by department
order by total_salary desc;