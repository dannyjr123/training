package com.training.services;

import com.training.model.BankAccount;

public class Application {
	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		
		BankAccount ram=new BankAccount(1200,"Ramesh",5000);
		
		BankAccount shazam = new BankAccount(6000,"shazam",5000);
		
		double simpleInterest=service.calculateInterest(ram);
		
		System.out.println("SimpleInterest = "+simpleInterest);
		
		System.out.println("SimpleInterest1 = "+service.calculateInterest(shazam));
		
		BankAccount[] accounts= new BankAccount[2];
		accounts[0]=ram;
		accounts[1]=shazam;
		System.out.println("Array values:");
		service.calculateInterest(accounts);
		BankAccount ramesh=new BankAccount(2000,"ramesh",4000,"savings");
		
		BankAccount[] account = {ram, shazam,ramesh};
		System.out.println("Arrays values:");
		service.calculateInterest(account);
		
		for(double values : service.findInterestByAccountType(accounts)){
			System.out.println("values"+values);
		}
		
		BankAccount[] accountList= {
				new BankAccount(8000,"jay",5000,"savings"),
				new BankAccount(5000,"ray",5000,"fixed"),
				new BankAccount(3000,"bay",8000,"recurring")
		};
		
		double[] interestValues=service.findInterestByAccountType(accountList);
		
		
		for(double eachValue: interestValues) {
			System.out.println(eachValue);
		}
	}
}
