# jdbc-encrypted-authentication
Base project: https://github.com/garciacarlos78/springboot-thymeleaf-CRUD-DB/tree/master/in-memory-authentication  

Target: change in-memory authentication by JDBC authentication with encrypted password.  

## Steps
- Create new database to manage permissions. This database will have tow tables:
  - users: where uernames and encrypted passwords will be
  - authorities: where roles of each user will be   

  Use /sql-scripts/create-user-accounts.sql to create this table.
  
- Add database connection properties to application.properties to access security info database

- Add Spring Data JPA properties to application.properties file. Define jpa repositories and jpa entities packages.

- Configure datasources in file DemoDataSourceConfig.java

- Configure Spring Security for Database Authentication: modify DemoSecurityConfig class.

