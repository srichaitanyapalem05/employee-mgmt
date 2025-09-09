USE ems;

INSERT INTO departments (dept_name) VALUES ('IT'), ('HR'), ('Finance');

INSERT INTO employees (full_name, email, dept_id, salary)
VALUES 
('Sai Teja', 'sai@email.com', 1, 75000),
('Bhanu', 'bhanu@email.com', 2, 50000),
('Charan', 'charan@email.com', 3, 65000);
