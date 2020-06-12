# springboot-thymeleaf-CRUD-DB
Complete Web UI for managing an Employees Directory from a MySQL database.    

Users will be able, via web, to:
- Get a list of employees
- Add a new employee
- Update an employee
- Delete an employee

Based in an https://www.udemy.com/course/spring-hibernate-tutorial/ project.  

Base project: https://github.com/garciacarlos78/thymeleaf-html-tables/tree/master/thymeleaf-html-table-css-bootstrap

## Steps
1. Modify project's architecture   

## Step 1 - Modify project's architecture
Added spring-boot-starter-data-jpa and mysql connector to Gradle.  
Entity, DAO, service and database connection properties (application.properties) from project http://www.luv2code.com/23-spring-project    
Database creation SQL script (/sql-scripts): http://www.luv2code.com/spring-boot-employee-sql-script   
Database user/pass: springstudent/springstudent  
 
Modified project's architecture:
- Deleted *model* package and `Employee` class
- Added *entiies* package and new `Employee` class, annotated to map to DB
- Added *daos* package and `JpaRepository` to access employees
- Added *services* package and employee services interface and implementation
- Still showing in-memory data
 


