package com.examples.around.advice.validator;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.examples.around.advice.beans.Account;
import com.examples.around.advice.beans.Cheque;

public class ChequeClearenceAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {

		Object[] params = mi.getArguments(); 
		Account acc = (Account)params[0]; 
		Cheque cheque = (Cheque)params[1];
		
		System.out.println("Hello Customer!, Check No "+cheque.getCheque_No()+" is coming for clearence"); 
		mi.proceed(); 
		System.out.println("Hello Customer!, Account Number "+acc.getAccNo()+" has been debited the amount "+cheque.getAmount()+" in clearence of the cheque No "+cheque.getCheque_No()+" , Now the total Amount in your Account is "+acc.getBalance() );
		
		return null;
	}

}
