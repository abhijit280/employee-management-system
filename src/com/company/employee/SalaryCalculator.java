package com.company.employee;

public class SalaryCalculator {

    public double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    public double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    public double calculateGrossSalary(double basicSalary) {
        return basicSalary
                + calculateHRA(basicSalary)
                + calculateDA(basicSalary);
    }

    public double calculateNetSalary(double basicSalary) {
        return calculateGrossSalary(basicSalary) - 200;
    }
}