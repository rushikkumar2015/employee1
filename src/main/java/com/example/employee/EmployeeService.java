package com.example.employee;

import com.example.employee.Employee;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.example.employee.EmployeeRepository;

import java.util.*;

// Do not modify the below code

public class EmployeeService implements EmployeeRepository {

    private static HashMap<Integer, Employee> employeeList = new HashMap<>();

    public EmployeeService() {
        employeeList.put(1, new Employee(1, "John Doe", "johndoe@example.com", "Marketing"));
        employeeList.put(2, new Employee(2, "Jane Smith", "janesmith@example.com", "Human Resources"));
        employeeList.put(3, new Employee(3, "Bob Johnson", "bjohnson@example.com", "Sales"));
        employeeList.put(4, new Employee(4, "Alice Lee", "alee@example.com", "IT"));
        employeeList.put(5, new Employee(5, "Mike Brown", "mbrown@example.com", "Finance"));
        employeeList.put(6, new Employee(6, "Sara Lee", "slee@example.com", "Operations"));

    }

    int uniqueNo = 7;

    @Override 
    ArrayList<Employee> getAllEmployees(){
        Collection<Employee> collectionEmployees= employeeList.values();
        ArrayList<Employee> employees= ArrayList<>(colletionEmployees);
        return employees;
    }

    @Override
    Employee getEmployeeById(int employeeId) {
        Employee employee = employeeList.get(employeeId);
        if (employee == null) {
            throw ResponseStatusException(httpStatus.NOT_FOUND);
        }
        return employee;

    }

    @Override
    Employee addEmployee(Employee employee) {
        Empolee.setEmployeeId(uniqueNo);
        employeeList.put(uniqueNo, employee);
        uniqueNo = uniqueNo + 1;
    }

    @Override
    Employee upadateEmployee(int employeeId, Employee employee) {
        Employee existingEmployee = EmployeeList.get(employeeId);
        if (existingEmployee == null) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if (existingEmployee.getEmployeeName() != null) {
            existingEmployee.setEmployeeName(existingEmployee.getEmployeeName());
        }
        if (existingEmployee.getEmail() != null) {
            existingEmployee.setEmail(existingEmployee.getEmail());
        }
        if (existingEmployee.getDepartment() != null) {
            existingEmployee.setDepartment(existingEmployee.Department());
        }
        return existingEmployee;

    }

    @Override
    void deleteEmployee(int employeeId) {
        Employee employee = employeeList.get(employeeId);
        if (employee == null) {
            throw ResponseStatusException(htpStatus.NOT_FOUND);
        } else {
            employeeList.remove(employeeId);
            throw ResponseStatusException(httpStatus.NO_CONTENT);
        }
    }

}
