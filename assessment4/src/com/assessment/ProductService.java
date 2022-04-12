package com.assessment;

import com.training.model1.*;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class ProductService {
	private Set<Product> set;

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
		set=new TreeSet<>();
	}

	public ProductService(Set<Product> set) {
		super();
		this.set = set;
	}
	
	public Set<Product> getTopThree(){
		Set<Product> modifiedSet=new TreeSet<Product>();
	
		  Iterator<Product> itr= set.iterator();
		  int i=0;
		  while(itr.hasNext()) {
			  
			  modifiedSet.add(itr.next());
			  i++;
			  if(i>3) {
				  break;
			  }
		  }  
		  
		  
		return modifiedSet;
	}
	
	public Set<Product> getTop(int n){
		Set<Product> modifiedSet=new TreeSet<Product>();
	
		  Iterator<Product> itr= set.iterator();
		  int i=1;
		  while(itr.hasNext()) {
			  
			  modifiedSet.add(itr.next());
			  i++;
			  if(i>n) {
				  break;
			  }
		  }  
		  
		  
		return modifiedSet;
	}
}
