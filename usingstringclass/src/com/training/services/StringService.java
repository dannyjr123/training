package com.training.services;

public class StringService {
	public void stringEquals(String str1, String str2) {
		System.out.println("is value Same :="+str1.equals(str2));
		System.out.println("Are they pointing to Same Location :="+(str1==str2));
		//Are they pointing to Same Location := ram == ram
		//(ram==ram)
	}
	
	public void stringObjectEquals() {
		String ram=new String("Ram");
		String ramesh=new String("Ram");
		
		System.out.println("is value Same :="+ram.equals(ramesh));
		System.out.println("Are they pointing to Same Location :="+(ram==ramesh));
		
		System.out.println(ram.hashCode());
		System.out.println(ramesh.hashCode());
	}
	
	public void usingTrim(String name) {
		System.out.println("without Trim:="+name);
		System.out.println("Trim:="+name.trim());
	}
	
	public void lengthOfString(String name) {
		
		System.out.println("String Length:= "+name.length());
	}
	
	public void usingSubString(String name) {
		System.out.println(name.substring(4));
		System.out.println(name.substring(2,5));
	}
	
	public void usingCharAt(String name) {
		System.out.println("indexOf @ is"+name.indexOf("@"));
	}
	
	public void usingReplace(String str1, String str2) {
		System.out.println(str1.replace(".com",".in"));
		System.out.println(str2.replace('c', 's'));
	}
	
	public void usingConcat(String str1, String str2) {
		System.out.println("concatination:= "+str1.concat(str2));
		
		StringBuilder builder=new StringBuilder(str1);
		builder.append(str2);
		
		System.out.println("Welcome to builder:= "+builder.toString());
	}
	
	public void usingCompareTo(String str1, String str2) {
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1, double mark) {
		String frmtString=String.format("Name is %S", str1);
		System.out.println(frmtString);
		
		System.out.println(String.format("Mark %.2f", mark));
	}
	
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x", mark));
	}
	
	public void usingStringFormat(int mark1, int mark2) {
		System.out.println(String.format("Octal %1$o \nHexa %2$x", mark1,mark2));
	}
	
	public void usingStringFormat(String mark1, String mark2) {
		System.out.println(String.format("BIG %2$S small %1$s", mark1,mark2));
	}
	
	public void usingStringFormat(long value) {
		System.out.println(String.format("%+d", value));
	}
}
