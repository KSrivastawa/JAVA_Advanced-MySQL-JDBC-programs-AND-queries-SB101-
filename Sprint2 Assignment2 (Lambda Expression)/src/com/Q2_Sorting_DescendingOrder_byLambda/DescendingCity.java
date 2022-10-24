package com.Q2_Sorting_DescendingOrder_byLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingCity {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Siwan", "Patna", "Chhappra", "Goa", "Gopalganj");
		
		/*
			Collections.sort(list);
			Collections.reverse(list);
			System.out.println(list);  // [Siwan, Patna, Gopalganj, Goa, Chhappra]
		*/
	
		// Using lambda Expression
		
		// In Ascending order
		list.stream().sorted().forEach(s -> System.out.println(s));
		
		/*
		 * output:
		  	Chhappra
			Goa
			Gopalganj
			Patna
			Siwan
		 */
		
		
		// In Descending Order
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		
		/*
		 * output:
		 	Siwan
			Patna
			Gopalganj
			Goa
			Chhappra
		 */
	}

}
