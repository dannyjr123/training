package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService service=new StringService();
		int key=13;
		
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.lengthOfString("  Ramesh  ");
			break;
		case 4:
			service.usingTrim("  ramesh  ");
			break;
		case 5:
			service.usingSubString("My name is Ramesh");
			break;
		case 6:
			service.usingReplace("dhanush.com", "ramech.in");
			break;
		case 7:
			service.usingConcat("Hello ", "world!");
			break;
		case 8:
			service.usingCharAt("dhanush@hotmail.com");
			break;
		case 9:
			service.usingCompareTo("a", "s");
			break;
		case 10:
			service.usingStringFormat("ram", 53.6321);
			break;
		case 11:
			service.usingStringFormat(42);
			break;
		case 12:
			service.usingStringFormat(32, 53);
			break;
		case 13:
			service.usingStringFormat("Hello", "world!");
			break;
		case 14:
			service.usingStringFormat(5L);
			break;
		default:
			break;
		}
		
		//System.out.println(String.format("%3$.4f %2$.3f %1$.2f", 42.53,35.26,63.346));
	}
}
