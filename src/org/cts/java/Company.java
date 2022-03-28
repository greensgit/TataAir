package org.cts.java;

public class Company implements Employee,EmployeeDetails  {

	@Override
	public void empAge() {

		System.out.println("Employee Age is 20");		
	}

	@Override
	public void empId() {

		System.out.println("Employee id is 635");
	}

	@Override
	public void empName() {

		System.out.println("Employee Name is Devi");
	}
	public static void main(String[] args) {
	
		Company l= new Company();
		l.empAge();
		l.empId();
		l.empName();
	}

	
}
