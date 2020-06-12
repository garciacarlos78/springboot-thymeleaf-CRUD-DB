package com.cgrdev.springbootthymeleafcruddb.controllers;

import com.cgrdev.springbootthymeleafcruddb.entities.Employee;
import com.cgrdev.springbootthymeleafcruddb.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class EmployeesController {

    // Injected Employee Service
    EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String table(Model model) {

        // get employees from database
        List<Employee> employees = employeeService.findAll();

        // add employees to the model
        model.addAttribute("employees", employees);

        // return web page
        return "employees-table";
    }
}
