package com.cgrdev.springbootthymeleafcruddb.daos;

import com.cgrdev.springbootthymeleafcruddb.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
