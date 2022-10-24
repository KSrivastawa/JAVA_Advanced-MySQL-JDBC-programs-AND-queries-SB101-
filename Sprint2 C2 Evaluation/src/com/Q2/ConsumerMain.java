package com.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {

		// print the student details
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Ketan1", 456));
		list.add(new Student(22, "Ketan2", 356));
		list.add(new Student(33, "Ketan4", 556));
		list.add(new Student(44, "Ketan3", 656));
		list.add(new Student(55, "Ketan5", 431));
		
		Consumer<Student> consumer = t -> System.out.println(t); 
		
		for(Student s : list) {
				consumer.accept(s);
		}
		
		/*
		 * output:
		 * 	Student [roll=11, name=Ketan1, marks=456]
			Student [roll=22, name=Ketan2, marks=356]
			Student [roll=33, name=Ketan4, marks=556]
			Student [roll=44, name=Ketan3, marks=656]
			Student [roll=55, name=Ketan5, marks=431]
		 */
		
		
	}

}
