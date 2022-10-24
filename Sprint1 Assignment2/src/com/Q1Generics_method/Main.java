package com.Q1Generics_method;

import java.util.*;

public class Main {

	public static void clasTeacherWithStudent(List<? super Student> list) {
		
		for(Object obj: list) {
			
			System.out.println(obj);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of details you want to Add:");
		int numDetails = sc.nextInt();
		
		List<Object> list = new ArrayList<>();
		List<Object> list2 = new ArrayList<>();

		
		for(int i=0; i<numDetails; i++) {
			
			System.out.println("Enter the class Teacher name: ");
			String tName = sc.next();
			
			list.add(tName);
			
			System.out.println("Enter no. of student details you want to Add:");
			int numSt = sc.nextInt();
			
			int c = 0; 
			for(int j=0; j<numSt; j++) {
				System.out.println("Enter details of Student "+ ++c +":");
				
				System.out.println("Enter roll:");
				int roll = sc.nextInt();
				
				System.out.println("Enter name:");
				String name = sc.next();
				
				System.out.println("Enter marks:");
				int marks = sc.nextInt();
				
				list2.add(new Student(name, roll,  marks));
				
			}

		}
		
		
		clasTeacherWithStudent(list);
		clasTeacherWithStudent(list2);

	}

}










