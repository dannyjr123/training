package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class SavingsAccountService extends BankAccountService{
	
	@Override
	public double calculateInterest(BankAccount account) { 	
		double simpleInterest=0.52;
		if(account.getAccountNumber()<=5000) {
			simpleInterest=0.63;
		}
		return account.getBalance()*1*simpleInterest;
	}													  
														  
	public String getCustomerInfo(SavingsAccount account){
		return account.getAccountHolderName();
	}
}
