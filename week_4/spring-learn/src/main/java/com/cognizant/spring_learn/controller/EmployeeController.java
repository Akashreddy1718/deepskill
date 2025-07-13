package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        LOGGER.info("START - getAllEmployees()");
        List<Employee> employees = employeeService.getAllEmployees();
        LOGGER.debug("Employee List: {}", employees);
        LOGGER.info("END - getAllEmployees()");
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        LOGGER.info("START - getEmployeeById({})", id);
        Employee employee = employeeService.getEmployeeById(id);
        LOGGER.debug("Found Employee: {}", employee);
        LOGGER.info("END - getEmployeeById()");
        return employee;
    }
}
