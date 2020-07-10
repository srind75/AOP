package com.examples.service;

import com.examples.beans.Account;
import com.examples.exceptions.InsufficientFundsException;

public interface TransactionService {
	public String withdraw(Account acc, int wd_Amt)throws InsufficientFundsException;
}
