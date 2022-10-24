package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {

		System.out.println(t+ " This is the Consumer Function: ");
		
	}
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = new MyConsumer();
		
		consumer.accept("Ketan");
		
	}

	
}
