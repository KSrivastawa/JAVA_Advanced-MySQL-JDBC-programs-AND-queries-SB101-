package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Supplier;

public class MySupplier1 {

	public static void main(String[] args) {
		
		Supplier<Double> supplier = () -> {
			
			int x = 45;
			float y = 3.5f;
			
			return (double) (x-y);
			
		};
		
		System.out.println(supplier.get());
		
		// also after minimizing
		
		Supplier<Double> supplier2 = () -> 78-5.5;
		
		System.out.println(supplier2.get());
		
	}
	
}
