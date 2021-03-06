package com.cgrdev.springbootthymeleafcruddb.controllers;

import com.cgrdev.springbootthymeleafcruddb.entities.Employee;
import com.cgrdev.springbootthymeleafcruddb.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;


@Controller
@RequestMapping("/employees")
public class EmployeesController {

    // Injected Employee Service
    EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String table(Model model) {

        // get employees from database
        List<Employee> employees = employeeService.findAll();

        // add employees to the model
        model.addAttribute("employees", employees);

        // return web page
        return "/employees/employees-list";
    }

    // catch the Add button click
    @GetMapping("/add-employee")
    public String addEmployee(Model model) {

        // create new employee to add to the model
        Employee employee = new Employee();

        // add employee to model
        model.addAttribute("employee", employee);

        // return add employee form
        return "/employees/add-employee-form";
    }

    // catch Update button
    @GetMapping("/update-employee")
    public String updateEmployee(@RequestParam("employeeId") int id,
                                 Model model) {

        // get employee from service
        Employee employee = employeeService.findById(id);

        // add employee to model
        model.addAttribute("employee", employee);

        // send over our form
        return "/employees/add-employee-form";
    }

    // catch Delete button
    @GetMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("employeeId") int id,
                                 Model model) {

        // delete employee via service
        employeeService.deleteById(id);

        // redirect to main page
        return "redirect:/employees";
    }

    // catch save button to save new employee data
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        // save received employee to database
        employeeService.save(employee);

        // redirect to main page
        return "redirect:/employees";

    }

}
