package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.beans.Employee;
import com.examples.service.EmployeeService;

public class Test_AspectJ_Declaritive {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/examples/resources/applicationContext.xml");
		EmployeeService empService = (EmployeeService) context.getBean("empService");
		Employee emp = (Employee) context.getBean("empBean");
		String message = "";
		try {
			message = empService.createEmployee(emp);
		} catch (Exception e) {

		}
		System.out.println(message);
	}

}
