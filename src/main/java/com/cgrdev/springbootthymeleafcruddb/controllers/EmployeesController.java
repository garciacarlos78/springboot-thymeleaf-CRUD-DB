package com.cgrdev.springbootthymeleafcruddb.controllers;

import com.cgrdev.springbootthymeleafcruddb.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Controller
public class EmployeesController {

    // class field to map the employees
    private List<Employee> employees = new ArrayList<>();

    // populate some data
    @PostConstruct
    private void createEmployees() {
        // create employees
        Employee employee1 = new Employee("Peter", "Griffin", "peter@family.guy");
        Employee employee2 = new Employee("Bart", "Simpson", "bart@simpson.com");
        Employee employee3 = new Employee("Lemmy", "Kilmister", "lemmy@motorhead.uk");

        //add employees to list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }


    @GetMapping("/employees")
    public String table(Model model) {

        // add employees to the model
        model.addAttribute("employees", employees);

        // return web page
        return "employees-table";
    }
}
