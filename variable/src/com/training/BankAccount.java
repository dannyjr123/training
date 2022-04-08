package com.training;

public class BankAccount {
	//stat
	private static int count=100000;
	
	//ins
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//stat method
	public static int getCount() {
		return count++;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}	

	//ins method
	public double getUpdatedBalance(double amount){
		//double updatedBalance;
		//System.out.println(updatedBalance);			
		return this.balance+=amount;
	}		
}