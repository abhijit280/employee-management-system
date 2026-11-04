package com.company.employee;

public class Main {

	public static void main(String[] args) {

		System.out.println("Employee Management System");

		EmployeeService service = new EmployeeService();

		Employee emp1 = new Employee(101, "Abhijit", "IT", 45000);

		Employee emp2 = new Employee(102, "Rahul", "HR", 35000);

		// Add employees
		service.addEmployee(emp1);
		service.addEmployee(emp2);

		// Display all employees
		System.out.println("\nAll Employees:");

		for (Employee employee : service.getAllEmployees()) {
			System.out.println(
					employee.getEmployeeId() + " - " + employee.getEmployeeName() + " - " + employee.getDepartment());
		}

		// Search employee
		Employee result = service.getEmployeeById(101);

		if (result != null) {
			System.out.println("\nEmployee Found: " + result.getEmployeeName());
		}
	}
}