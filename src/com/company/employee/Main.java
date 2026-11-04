package com.company.employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("Employee Management System");

        // Developer A: Employee creation
        EmployeeService service = new EmployeeService();

        Employee emp = new Employee(
                103,
                "Charlie",
                "Finance",
                55000
        );

        service.addEmployee(emp);

        System.out.println("New employee added successfully");
        
        // Developer B: Salary calculation
        SalaryCalculator calculator = new SalaryCalculator();

        double salary = calculator.calculateGrossSalary(45000);

        System.out.println("Gross Salary: " + salary);

        // Developer B: Employee report
        EmployeeReport report = new EmployeeReport();

        report.generateEmployeeReport();
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