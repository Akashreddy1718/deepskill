package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        List<Employee> employeeList = context.getBean("employeeList", List.class);
        return employeeList;
    }

    public Employee getEmployeeById(int id) {
        List<Employee> employees = getAllEmployees();
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
