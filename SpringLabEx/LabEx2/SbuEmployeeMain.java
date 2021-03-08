package com.abc.springcore.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Sbu;

public class SbuEmployeeMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Employee1 employee1 = (Employee1) context.getBean("employee1");
		Sbu sbu = (Sbu) context.getBean("sbu");
		List<Employee1> list = new ArrayList<>();
		list.add(employee1);
		List<Sbu> list1 = new ArrayList<>();
		list1.add(sbu);
		System.out.println("Employee Details:");
		list.stream().forEach(p ->{
			System.out.println(p.getEmployeeId()+" "+p.getEmployeeName()+" "+p.getSalary()+" "+p.getBussinessUnit());
		});
		System.out.println("SBU Details:");
		list1.stream().forEach(p->{
			System.out.println(p.getSbuId()+" "+p.getSbuName()+" "+p.getSbuHead());
		});
	}

}
