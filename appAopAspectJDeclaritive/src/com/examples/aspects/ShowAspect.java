package com.examples.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class ShowAspect {
	public void before() {
		System.out.println("Get Tickets for the Show");
	}

	public void around(ProceedingJoinPoint jp) {
		System.out.println("Show is Ready To start, Take Chairs and Keep mobiles in Silent mode");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Show Completed just now, Check your Laguages");
	}

	public void after() {
		System.out.println("Show is over , quit from Hall");
	}

	public void afterReturning() {
		System.out.println("Tankq for attending Show");
	}

	public void afterThrowing() {
		System.out.println("There is an Interruption in show, because, Show is not Mimicry show");
	}
}
