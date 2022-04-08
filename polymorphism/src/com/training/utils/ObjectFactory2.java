package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.model.Principal;

public class ObjectFactory2 extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		switch (key) {
		case 3:
			return new Principal("avadi");
		default:
			return super.getConditional(key);
		}
		
		/*if(key==3) {			
			value=new Principal("avadi");		
		}else {
			value=super.getConditional(key);
		}*/
	}	
}
