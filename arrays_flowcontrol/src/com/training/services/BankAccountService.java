package com.training.services;

import com.training.model.BankAccount;

public class BankAccountService{	
	public double calculateInterest(BankAccount account) {
		
		double simpleInterest=.05;
		if(account.getAccountNumber()<5000) {
			simpleInterest=.06;
		}
		
		return account.getBalance()*1*simpleInterest;
	}
	
	public void calculateInterest(BankAccount[] accounts) {
		for(BankAccount eAccount:accounts) {	
			System.out.println(this.calculateInterest(eAccount));
		}
	}
	
	/*private double[] findInterest(BankAccount[] accounts) {
		double[] value = new double[2];
		int i=0;
		for(BankAccount eAccount:accounts){			
			value[i]=calculateInterest(eAccount);	
			i++;
		}		
		return value;
	}*/	
	
	public double[] findInterestByAccountType(BankAccount[] accounts) {
		double[] values = new double[accounts.length];
		int i=0;
		for(BankAccount account:accounts) {
			if(account!=null) {
				switch (account.getAccountType()) {
				case "savings":
					values[i]=calculateByAccountType(account,0.05);
					break;
				case "fixed":
					values[i]=calculateByAccountType(account,0.06);
					break;
				case "recurring":
					values[i]=calculateByAccountType(account,0.07);
					break;			
				default:
					values[i]=calculateByAccountType(account,0.03);
					break;
				}
				i++;
			}
		}
		return values;
	}
	
	public double calculateByAccountType(BankAccount account,double simpleInterest) {		
		return account.getBalance()*1*simpleInterest;
	}
}
