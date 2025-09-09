-- View for high salary employees
CREATE OR REPLACE VIEW high_salary AS
SELECT e.full_name, d.dept_name, e.salary
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id
WHERE e.salary > 70000;

-- Procedure to get employees by dept
DELIMITER //
CREATE PROCEDURE getEmployeesByDept(IN p_dept VARCHAR(50))
BEGIN
  SELECT e.full_name, d.dept_name, e.salary
  FROM employees e
  JOIN departments d ON e.dept_id = d.dept_id
  WHERE d.dept_name = p_dept;
END //
DELIMITER ;
