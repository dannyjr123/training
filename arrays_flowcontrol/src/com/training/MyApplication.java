package com.training;

import java.util.Scanner;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;

public class MyApplication {
	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		Scanner scanner = new Scanner(System.in);
		
		int flag;
		int i=0;
		BankAccount[] list=new BankAccount[3];
		
		do {				
				System.out.println("AccountNumber");
				int accountNumber= scanner.nextInt();
				System.out.println("accountHolder");
				String accountHolderName= scanner.next();				
				System.out.println("balance");
				double balance = scanner.nextDouble();
				System.out.println("accountType");
				String accountType= scanner.next();
				
				System.out.println("enter 0 or 1");
				flag=scanner.nextInt();
				
				BankAccount account1=new BankAccount(accountNumber, accountHolderName, balance, accountType);
				list[i]=account1;
				i++;
		}while(flag==0);
		
		double[] values = service.findInterestByAccountType(list);
		
		for(double eachValue: values) {
			System.out.println(eachValue);
		}		
		
		scanner.close();
	}
}
