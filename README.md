# springboot-thymeleaf-CRUD-DB
Complete Web UI for managing an Employees Directory from a MySQL database.    

Users will be able, via web, to:
- Get a list of employees
- Add a new employee
- Update an employee
- Delete an employee

Based in a https://www.udemy.com/course/spring-hibernate-tutorial/ project.  

Base project: https://github.com/garciacarlos78/thymeleaf-html-tables/tree/master/thymeleaf-html-table-css-bootstrap

## /refactor
Base project modified to get data from DB.  
It just shows a bootstrap css styled table with the employees directory.    
Further details in [/refactor/README.md](/refactor/README.md)

## /add-employee
Added logic to add a new employee.  
Base project: */refactor*  
Further details in [/add-employee/README.md](/add-employee/README.md)

## /update-employee
Added logic to update an employee.  
Base project: */add-employee*  
Further details in [/update-employee/README.md](/update-employee/README.md)

## /delete-employee
Added logic to delete an employee.  
Base project: */update-employee*  
Further details in [/delete-employee/README.md](/delete-employee/README.md)

## /in-memory-authentication
Added in-memory authentication.    
Authorize and show resources based on rol.  
Base project: */delete-employee*  

Users (username - password - rol(s)):  
employee - employee - EMPLOYEE  
manager - manager - [EMPLOYEE, MANAGER]  
admin - admin - [EMPLOYEE, MANAGER, ADMIN]
  
Permissions per rol:  
EMPLOYEE: view employees' list  
MANAGER: view list, add employee, update employee  
ADMIN: view list, add employee, update employee, delete employee

Further details in [/in-memory-authentication/README.md](/in-memory-authentication/README.md)

# jdbc-encrypted-authentication
Changed in-memory authentication by JDBC with encrypted password authentication.  
Base project: */in-memory-authentication*  
Same credentials and roles as in base project.  
Further details in [/jdbc-encrypted-authentication/README.md](/jdbc-encrypted-authentication/README.md)
