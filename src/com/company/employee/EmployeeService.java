package com.company.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Search employee by ID
    public Employee getEmployeeById(int employeeId) {

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }

        return null;
    }
}