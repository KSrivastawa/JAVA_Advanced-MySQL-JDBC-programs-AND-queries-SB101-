package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.*;
import java.util.function.Consumer;

public class MyConsumer2_List {

	public static void main(String[] args) {
		
		 Consumer<List<String>> consumer = s-> System.out.println(s);
		
		consumer.accept(Arrays.asList("One", "Two", "Three", "Four", "By Lambda"));
			
		List<String> list =  Arrays.asList("One", "Two", "Three", "Four", "By Lambda");
		
		list.forEach( t -> System.out.println(t) );
		
	}
	
	
}
