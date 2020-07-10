package com.examples.after.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.examples.after.advice.beans.Student;

public class ThanqAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object return_Val, Method method, Object[] params, Object target) throws Throwable {
		Student std = (Student)params[0]; 
		String course_Name = (String)params[1]; 
		System.out.println("ThanQ "+std.getSname()+" for your course "+method.getName()+" on "+course_Name); 
		
	}

}
