package com.abc.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Employee;


public class EmployeeMain {

	public static void main(String[] args) {
		
//		Employee employee = new Employee();
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		int id = employee.getEmployeeId();
		String name = employee.getEmployeeName();
		double salary = employee.getSalary();
		String bU = employee.getBussinessUnit();
		int age = employee.getAge();
		
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Salary:" +salary);
		System.out.println("Bussiness Unit:" +bU);
		System.out.println("Age:" +age);

	}

}
