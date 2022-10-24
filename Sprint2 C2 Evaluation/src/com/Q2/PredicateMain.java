package com.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		
		// Predicate will result in boolean form if student marks are less than 500

		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Ketan1", 456));
		list.add(new Student(22, "Ketan2", 356));
		list.add(new Student(33, "Ketan4", 556));
		list.add(new Student(44, "Ketan3", 656));
		list.add(new Student(55, "Ketan5", 431));
		
		
		 Predicate<Student> predicate = t -> t.getMarks() < 500;
		 for(Student s : list) {
			 System.out.println(predicate.test(s));
		 }
		 
		 /* OutPut:
		    true
			true
			false
			false
			true
		  */
		 
		 list.removeIf(predicate);
		 for(Student s : list) {
			 System.out.println(predicate.test(s));
		 }
		 
		 /*Output:
		    false
			false
		  */

	}

}
