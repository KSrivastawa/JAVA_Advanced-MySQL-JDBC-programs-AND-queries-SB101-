package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.*;
import java.util.function.Predicate;

public class MyPredicate1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(7,8,5,9,9,6,3,4);
		
		Predicate<List<Integer>> predicate = t ->  t.contains(9); 
		
	   System.out.println(predicate.test(list));  // return boolean
		
	}
	
}
