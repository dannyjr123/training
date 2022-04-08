package com.training;

public class Application {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Ramesh",1000);
		System.out.println(account.getUpdatedBalance(2000));				
		
		System.out.println(account.getAccountNumber());
		
		BankAccount account1 = new BankAccount("suresh",2000);
		System.out.println(account1.getUpdatedBalance(3000));

		System.out.println(account1.getUpdatedBalance(2000));
			
		System.out.println(account1.getAccountNumber());
		String s="35";
		
		int a=Integer.valueOf(s);
		int b=Integer.parseInt(s);
		
		String s1 = Integer.toString(b);
		System.out.println(s1);
		System.out.println("valueOf"+a);
		System.out.println("parse"+b);
	}
}
