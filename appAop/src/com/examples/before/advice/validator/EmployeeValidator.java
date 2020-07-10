package com.examples.before.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.examples.before.advice.beans.Employee;

public class EmployeeValidator implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object target) throws Throwable {

		Employee emp = (Employee) params[0]; 
		System.out.println("Validation Messages for "+method.getName()); 
		System.out.println("-----------------------------------------------");
		
		if( emp.getEno() < 100 || emp.getEno() > 999) {
			System.out.println("*********Employee Number must be 3 digit number **********");
		}
		
		if( emp.getEsal() < 5000 || emp.getEsal() > 10000) { 
			System.out.println("********* Employee Salary Must be in between 5000 to 10000 ********");
		}
		
		if(!emp.getEemail().endsWith("@gmail.com")) { 
			System.out.println("********* Employee Email is Invalid *************"); 
			}
		
		if(!emp.getEmobile().startsWith("1-")) { 
			System.out.println("********* Employee Mobile Number is INvalid ********"); 
			}

	}

}
