// Write your code here
package com.example.employee

public class Employee {
    int employeeId;
    String employeeName;
    String email;
    String department;

    Employee(int employeeId,String employeeName,String email,String department){
        private this.employeeId=employeeId;
        private this.employeeName=employeeName;
        private this.email=email;
        private this.department=department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
     public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        }

    public String getEmail() {
        return email;
         }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}