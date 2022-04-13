package com.training;

import com.training.ifaces.Converter;
import com.training.services.ConcurrencyConverter;

public class Application {
	public static void main(String[] args) {
		
		Converter<Double, Double> converter = 
						 new ConcurrencyConverter();
		
		System.out.println(converter.convert(20.0));
		
		Converter<Double, Double> lambda = 
								   (val)->val*200.0;
								   
		System.out.println(   lambda.convert(20.0));
		
		Converter<String, Integer> strLength=(str) -> str.length();
		
		System.out.println(strLength.convert("Chennai"));
		
		print(lambda);
	}
	
	public static void print(Converter<Double,Double> conv) {
		
		System.out.println(conv.convert(30.00));
		
	}
}