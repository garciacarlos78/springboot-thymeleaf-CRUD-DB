package com.cgrdev.springbootthymeleafcruddb.daos;

import com.cgrdev.springbootthymeleafcruddb.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByOrderByLastNameAsc();
}
