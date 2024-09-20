package com.singelton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonMain {

	public static void main(String[] arg) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*********************************************
		 * 1. Singelton Design Pattern is used for a creational part
		 * 
		 * 2. Example :- Im Creating a Employee Class and create object a single object
		 * each hit create a single object
		 * 
		 * 3. Output :- Employee1 :: 1023487453 , Employee2 :: 1023487453
		 *********************************************/

		Employee employee1 = Employee.getEmployee();
		System.out.println("Employee1 :: " + employee1.hashCode());

		Employee employee2 = Employee.getEmployee();
		System.out.println("Employee2 :: " + employee2.hashCode());

		/*******************************************************
		 * 1. Break the singelton design pattern using reflection api 2. second way to
		 * break the design pattern using Desrilixation
		 * 
		 * output :- Employee1 :: 1023487453 ,Employee2 :: 1744347043
		 *******************************************************/

		System.out.println("-------------------------Break Singelton Design Pattern-----------------------");

		Employee emp1 = Employee.getEmployee();
		System.out.println("Employee1 :: " + emp1.hashCode());

		Constructor<Employee> constructor = Employee.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Employee emp2 = constructor.newInstance();
		System.out.println("Employee2 :: " + emp2.hashCode());

	}
}
