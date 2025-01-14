package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeService;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")

    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();

    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId" )int employeeId),@RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId,employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
}