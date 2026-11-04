package com.company.employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("Employee Management System");

        SalaryCalculator calculator = new SalaryCalculator();

        double salary = calculator.calculateGrossSalary(45000);

        System.out.println("Gross Salary: " + salary);

        EmployeeReport report = new EmployeeReport();

        report.generateEmployeeReport();
    }
}