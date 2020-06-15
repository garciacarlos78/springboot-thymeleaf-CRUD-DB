# in-memory-authentication
Base project: https://github.com/garciacarlos78/springboot-thymeleaf-CRUD-DB/tree/master/update-employee  

Target: add security to the web app.  

First version with in-memory authentication.

## Steps
- Update Gradle dependencies
- Define users, passwords and roles -> package *config*, class *DemoSecurityConfig.java*
- Define authorized content based on user role. Same class.
- Create new controller to manage login - access-denied pages -> *LoginController.java*
- Create login and access-denied templates -> folder */main/resources/templates/login*
- Hide buttons according to roles -> update *employees-list.html*, use thymeleaf spring security.
