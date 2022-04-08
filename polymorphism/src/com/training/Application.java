package com.training;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;
import com.training.utils.ObjectFactory2;

public class Application {
	public static void main(String[] args) {
		ObjectFactory objectFactory=new ObjectFactory();
		
		Conditional conditional = objectFactory.getConditional(1);
		
		System.out.println(conditional.test("chennai"));
		//System.out.println(conditional.toString());
		
		System.out.println("Allowance:="+objectFactory.getValue(conditional, "chennai"));
		
		System.out.println("Allowance:="+objectFactory.getValue(conditional,"90"));
		
		ObjectFactory2 objectFactory1=new ObjectFactory2();
		
		System.out.println(objectFactory1.getConditional(3));
	}
}
