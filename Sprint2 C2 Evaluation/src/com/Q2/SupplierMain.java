package com.Q2;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		
		// get the Student object with all details(roll, name ,marks)	
		
		Supplier<Object> supplier = () ->{
			
			Student student = new Student(11, "Ketan", 785);
			
			return student;
			
		};
		
		System.out.println(supplier.get());

		/*
		 * output:
		 * Student [roll=11, name=Ketan, marks=785]
		 */
		
	}

}
