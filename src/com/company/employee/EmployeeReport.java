package com.company.employee;

public class EmployeeReport {

	public void generateEmployeeReport() {

		System.out.println("========== EMPLOYEE REPORT ==========");

		displayEmployeeDetails(101, "Alpha", "IT", 45000);

		System.out.println("=====================================");
	}

	public void displayEmployeeDetails(int employeeId, String employeeName, String department, double basicSalary) {

		System.out.println("Employee ID   : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Department    : " + department);
		System.out.println("Basic Salary  : " + basicSalary);
	}
}