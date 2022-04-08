package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.model.Professor;
import com.training.model.Student;

public class ObjectFactory {
	
	
	public Conditional getConditional(int key) {
		switch (key) {
		case 1:
			return new Professor("phD");
		case 2:
			return new Student(89);
		default:
			return null;
		}
	}
	
	public double getValue(Conditional obj, Object object) {
		//Here obj reference type is Conditional but objects
		//are student or professor or principal
		//at runtime test method in the respective objects is called
		//hence run time polymorphism
		
		boolean result = obj.test(object);
		
		double travelAllowance=1000;
		
		if(result) {
			travelAllowance=2000;
		}
		
		return travelAllowance;		
	}
}
