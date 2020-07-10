package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.before.advice.beans.Employee;
import com.examples.before.advice.service.EmployeeService;

public class Test_Before_Advice {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/examples/resources/ApplicationContextBeforeAdvice.xml");
		Employee emp = (Employee) context.getBean("empBean");
		EmployeeService empService = (EmployeeService) context.getBean("empProxy");
		empService.displayEmployee(emp);
		System.out.println();
		empService.getEmployeeDetails(emp);

	}

}
