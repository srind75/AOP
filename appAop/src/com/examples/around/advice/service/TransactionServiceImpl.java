package com.examples.around.advice.service;

import com.examples.around.advice.beans.Account;
import com.examples.around.advice.beans.Cheque;

public class TransactionServiceImpl implements TransactionService {
	
	@Override 
	public void debit(Account acc, Cheque cheque) { 
		int initial_Amount = acc.getBalance(); 
		int debit_Amount = cheque.getAmount(); 
		int total_Amount = initial_Amount - debit_Amount; 
		acc.setBalance(total_Amount); 
		System.out.println("*******Transaction Success*******************"); 
		System.out.println("*******Amount is debited from Account********");
		
	}

}
