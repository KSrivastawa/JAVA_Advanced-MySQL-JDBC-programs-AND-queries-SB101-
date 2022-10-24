package com.pq;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ShortingOrder_byComparotor {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of students details want to Add:");
		
		int noOfStudents = sc.nextInt();
		
		int roll, marks; String name;
		
		Queue<Students> student = new PriorityQueue<>(new CompareByMarks());
		
		Students st;
		
		int c =0;
		for(int i=0 ; i<noOfStudents; i++) {
			
			System.out.println("Enter student details "+ ++c +":");
			
			System.out.println("\nEnter Roll number:");
			roll =  sc.nextInt();
			
			System.out.println("Enter Name:");
			name =  sc.next();
			
			System.out.println("Enter Marks:");
			marks =  sc.nextInt();
			
			
			st = new Students(roll, name, marks);
			
			
			student.add(st);
			
			
		}
		
		 System.out.println();
		
		Iterator<Students> itr = student.iterator();
		
		int count = 0;
		while(itr.hasNext()) {
			Students s = itr.next();
			
			System.out.println("Displayed details of Student "+ ++count+" :");
			System.out.println("Student Roll: "+s.getRoll());
			System.out.println("Student Name: "+s.getName());
			System.out.println("Student Marks: "+s.getMarks());
			System.out.println("----------------------------");
			
		}

	}

}
