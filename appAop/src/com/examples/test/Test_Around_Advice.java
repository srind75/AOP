package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.around.advice.beans.Account;
import com.examples.around.advice.beans.Cheque;
import com.examples.around.advice.service.TransactionService;

public class Test_Around_Advice {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/examples/resources/ApplicationContextAroundAdvice.xml"); 
		Account account = (Account) context.getBean("accBean"); 
		Cheque cheque = (Cheque) context.getBean("chequeBean"); 
		TransactionService tx_Service = (TransactionService) context.getBean("proxy"); 
		tx_Service.debit(account, cheque);

	}

}
