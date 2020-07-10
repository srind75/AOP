package com.examples.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectBean {
	public void before(JoinPoint jp) { 
		System.out.println("Before "+jp.getSignature().getName()+" method execution"); 
		} 
	
	public void after(JoinPoint jp) { 
	System.out.println("After "+jp.getSignature().getName()+" method execution"); 
	} 
	
	public void afterReturning(JoinPoint jp, Object result) { 
		 System.out.println("After Returning "+result+" from "+jp.getSignature().getName());
	}
	
	public void around(ProceedingJoinPoint jp) { 
		System.out.println("Before "+jp.getSignature().getName()+"execution from around Advice"); 
		try { 
			jp.proceed(); 
			} catch (Throwable e) { 
				e.printStackTrace(); 
				} 
		
		System.out.println("After "+jp.getSignature().getName()+"execution from around Advice"); 
		 }
	
	
	public void afterThrowing(JoinPoint jp, Throwable exception) { 
		System.out.println("After throwing "+exception+" from "+jp.getSignature().getName()+" method");
	}
	
	

}
