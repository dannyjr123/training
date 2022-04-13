package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingPredicate {
	public static void main(String[] args) {
		List<String> names =
				Arrays.asList(	"India","Srilanka",
								"United States",
								"Ireland","Bhutan");
		
		Predicate<String> containsChar =
				(country)-> country.toLowerCase()
								.startsWith("I");
				
				Consumer<String> consumer = (value) -> System.out.println(value);
				
				Consumer<String> consumer1 = (value) -> {
					if(containsChar
						.test(value))System.out.println(value);
				};
				
				/*names.removeIf(containsChar);*/
				names.forEach(consumer);
				names.forEach(consumer1);
				/*names.forEach((value) -> System.
							out.println(value));*/
	}
}