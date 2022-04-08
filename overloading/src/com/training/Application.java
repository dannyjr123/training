package com.training;

import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Converter convert = new Converter();
		System.out.println("Enter the name:");
		String value = scan.next();
		System.out.println("Your Name is :"+convert.convert(value));
		
		System.out.println("Enter Farenate Temperature:");
		double farenTemp= scan.nextDouble();
		
		//System.out.println(convert.convert(value));		
		
		System.out.println("celsius Temp: "+convert.convert(farenTemp));
		
		System.out.println("Enter the amount:");
		double amt=scan.nextDouble();
		
		int frm=scan.nextInt();
		
		System.out.println(convert.convert(amt,frm));
		scan.close();
	}
}
