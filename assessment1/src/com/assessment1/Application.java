package com.assessment1;

import com.training.Address;

public class Application {
	public static void main(String[] args) {
		
	
	Address address=new Address(101, "khroad", "ayanavaram", "chennai", "India", 600023);
	
	MobileBill mobileBill=new MobileBill("dhanush", 92442947820l,"prepaid", address);
	System.out.println(mobileBill.getAddress());
	System.out.println(mobileBill.findAmount());
	System.out.println(MobileBill.SERVICE_PROVIDER);
	System.out.println(mobileBill.toString());
	}	
}
