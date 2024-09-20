package com.singelton;

public class Employee {

	private static Employee employee;
	
	private Employee() {
		
	}
	
	public static Employee getEmployee() {
		if(employee==null) {
			synchronized (Employee.class) {
				if(employee==null) employee=new Employee();
			}
		}
		return employee;
	}
}
