package com.training.services;

import java.util.TreeSet;
import com.assessment.ProductService;
import com.training.model1.Product;

public class App {
	public static void main(String[] args) {		
	
	Product chair = new Product(101, "chair", 2000);	
	Product table = new Product(102, "table", 7440);
	Product micro = new Product(103, "micro", 8600);
	Product box = new Product(104, "box", 2000);
	Product	machine = new Product(105, "machine", 7500);
	Product label = new Product(106, "label", 2300);
	Product spoon = new Product(107, "spoon", 8900);
	
	TreeSet<Product> set = new TreeSet<>();
	set.add(table);
	set.add(chair);
	set.add(micro);
	set.add(box);
	set.add(machine);
	set.add(spoon);
	set.add(label);
	
	ProductService service= new ProductService(set);
	System.out.println(service.getTopThree()); 
	}
}
