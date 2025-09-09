📌 Employee Management Project

📖 Overview

This project demonstrates a complete Employee Management System with two parts:
	1.	Database Layer (MySQL + AWS RDS)
	•	Schema, sample data, queries, procedures, triggers, views.
	•	Hosted on AWS RDS for cloud access.
	2.	Application Layer (Spring Boot + JPA + REST API)
	•	REST endpoints to manage employees and departments.
	•	Tested using Postman / PowerShell.
	•	Runs on Tomcat (default: port 8080 / 8081).

⸻

🗂 Folder Structure

employee-mgmt/
├── employee-mgmt-sql/         # Database project
│   ├── schema.sql
│   ├── seed.sql
│   ├── queries.sql
│   ├── procedures_triggers_views.sql
│   ├── snapshots_notes.md
│   └── README.md

├── employee-mgmt-springboot/  # Spring Boot project
│   ├── src/main/java/...
│   ├── pom.xml
│   ├── application.properties
│   └── README.md


⸻

⚡ Database Setup (MySQL on AWS RDS)
	1.	Create an RDS MySQL instance on AWS.
	2.	Note down:
	•	Endpoint (e.g., emsdb.c3u0oo68mhn7.ap-south-1.rds.amazonaws.com)
	•	Port = 3306
	•	Master username (e.g., admin)
	•	Password (your choice)
	3.	Update Security Group:
	•	Allow inbound rule for MySQL/Aurora (3306) from My IP.
	4.	Connect via MySQL Workbench:

Hostname: <RDS endpoint>
Port: 3306
Username: admin
Password: *****


	5.	Run scripts in order:
	•	schema.sql
	•	seed.sql
	•	queries.sql
	•	procedures_triggers_views.sql

⸻

🚨 Important Note About Endpoint
	•	RDS endpoint is not a website.
	•	If you paste it in Chrome, you’ll see “Site can’t be reached”.
	•	It must be used with:
	•	MySQL Workbench
	•	Spring Boot App
	•	Command Line (mysql -h <endpoint> -u admin -p)

⸻

⚙ Spring Boot Setup
	1.	Clone the project:

git clone https://github.com/yourusername/employee-mgmt.git
cd employee-mgmt/employee-mgmt-springboot


	2.	Update application.properties:

spring.datasource.url=jdbc:mysql://<RDS-endpoint>:3306/ems
spring.datasource.username=admin
spring.datasource.password=YourPassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


	3.	Run app:

mvn spring-boot:run

or run EmployeeMgmtApplication from IntelliJ.

	4.	App runs at:

http://localhost:8081/employees



⸻

📡 API Endpoints

Employees
	•	GET /employees
	•	GET /employees/{id}
	•	POST /employees
	•	PUT /employees/{id}
	•	DELETE /employees/{id}

Departments
	•	GET /departments
	•	POST /departments

⸻

🛠 Tools & Tech
	•	MySQL 8 + AWS RDS
	•	Spring Boot 3, JPA, Hibernate
	•	Postman, PowerShell
	•	Maven
	•	Git + GitHub

⸻

👨‍💻 Author

Gouru Sai Teja

⸻

