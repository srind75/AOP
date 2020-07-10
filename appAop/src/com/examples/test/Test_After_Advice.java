package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.after.advice.beans.Student;
import com.examples.after.advice.bo.InstituteService;
import com.examples.before.advice.beans.Employee;
import com.examples.before.advice.service.EmployeeService;

public class Test_After_Advice {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/examples/resources/ApplicationContextAfterAdvice.xml");
		Student std = (Student) context.getBean("stdBean");
		InstituteService inst_Service = (InstituteService) context.getBean("proxy");
		inst_Service.enquiry(std, "MECH");
		System.out.println();
		inst_Service.registration(std, "MECH");
		
	}

}
