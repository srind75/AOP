package com.examples.around.advice.service;

import com.examples.around.advice.beans.Account;
import com.examples.around.advice.beans.Cheque;

public interface TransactionService {
	public void debit(Account acc, Cheque cheque );
}
