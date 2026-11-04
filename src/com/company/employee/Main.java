package com.company.employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("Employee Management System");

        EmployeeService service = new EmployeeService();

        Employee emp = new Employee(
                103,
                "Charlie",
                "Finance",
                55000
        );

        service.addEmployee(emp);

        System.out.println("New employee added successfully");

        System.out.println("\nAll Employees:");

        for (Employee employee : service.getAllEmployees()) {
            System.out.println(
                    employee.getEmployeeId() + " - "
                    + employee.getEmployeeName() + " - "
                    + employee.getDepartment()
            );
        }
    }
}