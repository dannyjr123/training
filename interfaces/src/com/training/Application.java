package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;
import com.training.model.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CurrencyConverter converter=new CurrencyConverter();
//		System.out.println(converter.apply(200));
		
		Function function=new CurrencyConverter();
		System.out.println(function.apply(20));
		
		System.out.println(Function.COUNTER);
		if(function instanceof CheckCondition) {
		System.out.println("Is Discount Allowed:=");
		}
	}
}