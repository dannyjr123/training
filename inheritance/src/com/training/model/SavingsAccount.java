package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	
	//whenever sub class constructor is called its super class
	//constructor also called even if super() key word is not present
	
	public SavingsAccount(){
		//super();
		//super(434,"gag",535.3);
		super(535, "dhanush", 5353, "savings");
		System.out.println("Constructor of sub Class called");
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;	
		}
}