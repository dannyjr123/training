package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {
	public static void main(String[] args) {
		
		BankAccount ramAccount = new BankAccount(1010,"Ramesh",50000,"savings");
		
		System.out.println(ramAccount);
		
		SavingsAccount savingsAccount=new SavingsAccount(650,"Ramesh",678,"joint","Rajesh");
		
		System.out.println(ramAccount.getAccountHolderName());
		System.out.println(savingsAccount.getNominee());	
		
		
		SavingsAccountService savingsAccountService=new SavingsAccountService();
		
		System.out.println(savingsAccountService.getCustomerInfo(savingsAccount));
		
		System.out.println(savingsAccountService.calculateInterest(ramAccount));
		
		BankAccountService service = new SavingsAccountService();
		
		//cannot access the sub class method with super class reference 
		//service.getCustomerInfo(account);
		
		SavingsAccountService service2  =(SavingsAccountService)service;
		
		
		
		System.out.println(service2.getCustomerInfo(savingsAccount));
	}
}
