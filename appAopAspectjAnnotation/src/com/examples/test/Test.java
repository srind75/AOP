package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.beans.Account;
import com.examples.exceptions.InsufficientFundsException;
import com.examples.service.TransactionService;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"/com/examples/resources/applicationContext.xml");
		Account acc = (Account) context.getBean("accBean");
		TransactionService txService = (TransactionService) context.getBean("transaction");
		try {
			txService.withdraw(acc, 50000);
		} catch (InsufficientFundsException e) {
			// e.printStackTrace();
		}
	}

}
