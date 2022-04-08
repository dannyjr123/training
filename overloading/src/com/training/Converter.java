package com.training;

public class Converter {
	public String convert(String str) {
		return str.toUpperCase();
	}	
	
	public double convert(double farenTemp){
		return (farenTemp-32)*5/9;
	}
	
	public double convert(double amt,int frm){
		return frm<1 ? amt*100 : amt*120;
	}
}
