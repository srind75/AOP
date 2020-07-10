package com.examples.throwsadvice.validator;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

public class MoneyReturnAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] params, Object target, Exception e) {
		System.out.println(
				"Power Failure Exception Occurred");
	}

}
