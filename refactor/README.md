# refactor
Base project: https://github.com/garciacarlos78/thymeleaf-html-tables/tree/master/thymeleaf-html-table-css-bootstrap  

Target: change data source from memory to external database.

## Steps
1. Modify project's architecture
2. Use database data   

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
 
## Step 2 - Use database data
- Removed in-memory code
- Injected service to controller
- Show data from database, through injected service
- Added index.html that redirects to /employees

